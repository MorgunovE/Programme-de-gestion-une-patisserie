package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Category.Refrigerable;
import Components.Produit.Produit;

public class Gateau extends Produit implements Emballable, Perissable, Refrigerable {
    private boolean estEmballe;
    private double temperatureActuelle;
    private int dureeDeVie;
    private boolean estConsommable;
    private double temperatureOptimale;
    private String typeEmballage;

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
     */
    public Gateau(String nom, String code, double prix, double poids, int dureeDeVie, double temperatureOptimale, String typeEmballage) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.estConsommable = true;
        this.temperatureOptimale = temperatureOptimale;
        this.typeEmballage = typeEmballage;
    }

    public  void emballer() {
        estEmballe = true;
    }

    public String estBiodegradableOuRecyclable() {
        return typeEmballage;
    }

    public String validerEtatEmballage() {
        return estEmballe ? "Le gâteau est emballé." : "Le gâteau n'est pas emballé.";
    }

    public String verifierTemperature(double temperatureActuelle) {
        this.temperatureActuelle = temperatureActuelle;
        return temperatureActuelle <= temperatureOptimale ? "Le gâteau est réfrigéré." : "Le gâteau n'est pas réfrigéré.";
    }

    public String eliminerProduit() {
        return "Le gâteau a été jeté.";
    }

    public String verifierEtat() {
        return validerEtatEmballage() + "\n" + verifierTemperature(temperatureActuelle);
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public String estConsommable() {
        return estConsommable ? "Le gâteau est consommable." : "Le gâteau n'est pas consommable.";
    }
    public double getTemperatureOptimale() {
        return temperatureOptimale;
    }
}
