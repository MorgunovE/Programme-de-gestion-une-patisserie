package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Produit;

public class PainFrais extends Produit implements Emballable, Perissable {
    private boolean estEmballe;
    private int dureeDeVie;
    private boolean estConsommable;
    private String typeEmballage;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     * @param dureeDeVie la durée de vie du produit
     * @param typeEmballage le type d'emballage du produit
     */
    public PainFrais(String nom, String code, double prix, double poids, int dureeDeVie, String typeEmballage) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.estConsommable = true;
        this.typeEmballage = typeEmballage;
    }

    public void emballer() {
        estEmballe = true;
    }

    public String estBiodegradableOuRecyclable() {
        return typeEmballage;
    }

    public String validerEtatEmballage() {
        return estEmballe ? "Le pain frais est emballé." : "Le pain frais n'est pas emballé.";
    }

    public String eliminerProduit() {
        return "Le pain frais a été jeté.";
    }

    public String verifierEtat() {
        return validerEtatEmballage();
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public String estConsommable() {
        return estConsommable ? "Le pain frais est consommable." : "Le pain frais n'est pas consommable.";
    }
}
