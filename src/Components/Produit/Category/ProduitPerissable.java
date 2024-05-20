package Components.Produit.Category;

import Components.Produit.Produit;

public class ProduitPerissable extends Produit {
    private int dureeDeVie;

    public ProduitPerissable(String nom, String code, double prix, double poids, int dureeDeVie) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }
}
