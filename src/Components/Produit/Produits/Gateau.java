package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Category.Refrigerable;
import Components.Produit.Produit;

public class Gateau extends Produit implements Emballable, Perissable, Refrigerable {
    private boolean estEmballe;
    private double temperatureActuelle;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     */
    public Gateau(String nom, String code, double prix, double poids) {
        super(nom, code, prix, poids);
    }

    public  void emballer() {
        estEmballe = true;
    }

    public String validerEtatEmballage() {
        return estEmballe ? "Le gâteau est emballé." : "Le gâteau n'est pas emballé.";
    }

    public String verifierTemperature(double temperatureActuelle) {
        this.temperatureActuelle = temperatureActuelle;
        return temperatureActuelle <= 0 ? "Le gâteau est réfrigéré." : "Le gâteau n'est pas réfrigéré.";
    }

    public String eliminerProduit() {
        return "Le gâteau a été jeté.";
    }

    public String verifierEtat() {
        return validerEtatEmballage() + "\n" + verifierTemperature(temperatureActuelle);
    }
}
