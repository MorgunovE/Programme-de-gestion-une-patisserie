package Components.Produit.Category;

import Components.Produit.Produit;

/**
 * Classe représentant un produit réfrigérable.
 * Un produit réfrigérable est un produit qui nécessite une température de réfrigération spécifique.
 */
public class ProduitRefrigerable extends Produit {
    private double temperatureDeRefrigeration;

    /**
     * Constructeur de la classe ProduitRefrigerable.
     *
     * @param nom                      le nom du produit
     * @param code                     le code du produit
     * @param prix                     le prix du produit
     * @param poids                    le poids du produit
     * @param temperatureDeRefrigeration la température de réfrigération du produit
     */
    public ProduitRefrigerable(String nom, String code, double prix, double poids, double temperatureDeRefrigeration) {
        super(nom, code, prix, poids);
        this.temperatureDeRefrigeration = temperatureDeRefrigeration;
    }

    /**
     * Retourne la température de réfrigération du produit.
     *
     * @return la température de réfrigération du produit
     */
    public double getTemperatureDeRefrigeration() {
        return temperatureDeRefrigeration;
    }

    /**
     * Définit la température de réfrigération du produit.
     *
     * @param temperatureDeRefrigeration la température de réfrigération du produit
     */
    public void setTemperatureDeRefrigeration(double temperatureDeRefrigeration) {
        this.temperatureDeRefrigeration = temperatureDeRefrigeration;
    }

    /**
     * Vérifie si le produit est conservé à la bonne température.
     *
     * @param temperatureActuelle la température actuelle de conservation du produit
     * @return une chaîne de caractères indiquant si le produit est conservé à la bonne température ou non
     */
    public String verifierTemperature(double temperatureActuelle) {
        if (temperatureActuelle == temperatureDeRefrigeration) {
            return "Le produit " + getNom() + " est conservé à la bonne température.";
        }
        return "Le produit " + getNom() + " n'est pas conservé à la bonne température. Il devrait être conservé à " + temperatureDeRefrigeration + " degrés.";
    }
}
