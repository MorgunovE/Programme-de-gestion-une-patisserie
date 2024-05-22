package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Category.Refrigerable;
import Components.Produit.Produit;

public class GateauGlace extends Produit implements Emballable, Perissable, Refrigerable {
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
    public GateauGlace(String nom, String code, double prix, double poids, int dureeDeVie, double temperatureOptimale, String typeEmballage) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.estConsommable = true;
        this.temperatureOptimale = temperatureOptimale;
        this.typeEmballage = typeEmballage;
    }

    @Override
    public  void emballer() {
        estEmballe = true;
    }

    @Override
    public String estBiodegradableOuRecyclable() {
        return typeEmballage;
    }

    @Override
    public String validerEtatEmballage() {
        return estEmballe ? "Le gâteau glace est emballé." : "Le gâteau glace n'est pas emballé.";
    }

    @Override
    public String verifierTemperature(double temperatureActuelle) {
        this.temperatureActuelle = temperatureActuelle;
        return temperatureActuelle <= temperatureOptimale ? "Le gâteau glace est réfrigéré." : "Le gâteau glace n'est pas réfrigéré.";
    }

    @Override
    public String eliminerProduit() {
        return "Le gâteau glace a été jeté.";
    }

    @Override
    public String verifierEtat() {
        return validerEtatEmballage() + "\n" + verifierTemperature(temperatureActuelle);
    }

    @Override
    public int getDureeDeVie() {
        return dureeDeVie;
    }

    @Override
    public String estConsommable() {
        return estConsommable ? "Le gâteau glace est consommable." : "Le gâteau glace n'est pas consommable.";
    }

    @Override
    public double getTemperatureOptimale() {
        return temperatureOptimale;
    }

}
