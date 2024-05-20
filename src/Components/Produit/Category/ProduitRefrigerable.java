package Components.Produit.Category;

import Components.Produit.Produit;

public class ProduitRefrigerable extends Produit {
    private double temperatureDeRefrigeration;

    public ProduitRefrigerable(String nom, String code, double prix, double poids, double temperatureDeRefrigeration) {
        super(nom, code, prix, poids);
        this.temperatureDeRefrigeration = temperatureDeRefrigeration;
    }

    public double getTemperatureDeRefrigeration() {
        return temperatureDeRefrigeration;
    }

    public void setTemperatureDeRefrigeration(double temperatureDeRefrigeration) {
        this.temperatureDeRefrigeration = temperatureDeRefrigeration;
    }
}
