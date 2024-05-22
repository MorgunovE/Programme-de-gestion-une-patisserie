package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Produit;

import java.time.LocalDate;

public class PainFrais extends Produit implements Emballable, Perissable {
    private boolean estEmballe;
    private int dureeDeVie;
    private boolean estConsommable;
    private String typeEmballage;
    private LocalDate dateDePreparation;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     * @param dureeDeVie la durée de vie du produit
     * @param typeEmballage le type d'emballage du produit
     * @param dateDePreparation la date de préparation du produit
     */
    public PainFrais(String nom, String code, double prix, double poids, int dureeDeVie, String typeEmballage, LocalDate dateDePreparation) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.dateDePreparation = dateDePreparation;
        this.estConsommable = verifierEtat();
        this.typeEmballage = typeEmballage;
    }

    @Override
    public void emballer() {
        estEmballe = true;
    }

    @Override
    public Boolean estBiodegradableOuRecyclable() {
        return typeEmballage.equalsIgnoreCase("carton") || typeEmballage.equalsIgnoreCase("papier") || typeEmballage.equalsIgnoreCase("Recyclable") || typeEmballage.equalsIgnoreCase("Biodegradable");
    }

    @Override
    public String validerEtatEmballage() {
        return estEmballe ? "Le pain frais est emballé." : "Le pain frais n'est pas emballé.";
    }

    @Override
    public String eliminerProduit() {
        return "Le pain frais a été jeté.";
    }

    @Override
    public Boolean verifierEtat() {
        if(LocalDate.now().isAfter(dateDePreparation.plusDays(dureeDeVie))) {
            eliminerProduit();
            estConsommable = false;
            return false;
        }
        return true;
    }

    @Override
    public int getDureeDeVie() {
        return dureeDeVie;
    }

    @Override
    public Boolean estConsommable() {
        verifierEtat();
        return estConsommable;
    }

    @Override
    public LocalDate getDateDePreparation() {
        return dateDePreparation;
    }
}
