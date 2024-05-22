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
}
