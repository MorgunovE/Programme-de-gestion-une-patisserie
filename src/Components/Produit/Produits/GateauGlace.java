package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Category.Refrigerable;
import Components.Produit.Produit;

import java.time.LocalDate;

public class GateauGlace extends Produit implements Emballable, Perissable, Refrigerable {
    private boolean estEmballe;
    private int dureeDeVie;
    private boolean estConsommable;
    private double temperatureOptimale;
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
     * @param temperatureOptimale la température optimale de conservation du produit
     * @param typeEmballage le type d'emballage du produit
     * @param dateDePreparation la date de préparation du produit
     */
    public GateauGlace(String nom, String code, double prix, double poids, int dureeDeVie, double temperatureOptimale, String typeEmballage, LocalDate dateDePreparation) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.dateDePreparation = dateDePreparation;
        this.estConsommable = verifierEtat();
        this.temperatureOptimale = temperatureOptimale;
        this.typeEmballage = typeEmballage;
    }

    @Override
    public  void emballer() {
        estEmballe = true;
    }

    @Override
    public Boolean estBiodegradableOuRecyclable() {
        return typeEmballage.equalsIgnoreCase("carton") || typeEmballage.equalsIgnoreCase("papier") || typeEmballage.equalsIgnoreCase("Recyclable") || typeEmballage.equalsIgnoreCase("Biodegradable");
    }

    @Override
    public String validerEtatEmballage() {
        return estEmballe ? "Le gâteau glace est emballé." : "Le gâteau glace n'est pas emballé.";
    }

    @Override
    public String verifierTemperature(double temperatureActuelle) {
        return temperatureActuelle <= temperatureOptimale ? "Le gâteau glace est réfrigéré." : "Le gâteau glace n'est pas réfrigéré.";
    }

    @Override
    public String eliminerProduit() {
        return "Le gâteau glace a été jeté.";
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
    public double getTemperatureOptimale() {
        return temperatureOptimale;
    }

    @Override
    public LocalDate getDateDePreparation() {
        return dateDePreparation;
    }

}
