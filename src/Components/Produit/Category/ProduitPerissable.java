package Components.Produit.Category;

import Components.Produit.Produit;

/**
 * Classe représentant un produit périssable.
 * Un produit périssable est un produit qui a une durée de vie limitée.
 */
public class ProduitPerissable extends Produit {
    private int dureeDeVie;

    /**
     * Constructeur de la classe ProduitPerissable.
     *
     * @param nom         le nom du produit
     * @param code        le code du produit
     * @param prix        le prix du produit
     * @param poids       le poids du produit
     * @param dureeDeVie  la durée de vie du produit
     */
    public ProduitPerissable(String nom, String code, double prix, double poids, int dureeDeVie) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
    }

    /**
     * Retourne la durée de vie du produit.
     *
     * @return la durée de vie du produit
     */
    public int getDureeDeVie() {
        return dureeDeVie;
    }

    /**
     * Définit la durée de vie du produit.
     *
     * @param dureeDeVie la durée de vie du produit
     */
    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }
}
