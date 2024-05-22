package Components.Produit.Category;

import Components.Produit.Produit;

/**
 * Classe représentant un produit emballable.
 * Un produit emballable est un produit qui a un emballage biodégradable.
 */
public class ProduitEmballable extends Produit {
    private boolean emballageBiodegradable;

    /**
     * Constructeur de la classe ProduitEmballable.
     *
     * @param nom                  le nom du produit
     * @param code                 le code du produit
     * @param prix                 le prix du produit
     * @param poids                le poids du produit
     * @param emballageBiodegradable si l'emballage est biodégradable ou non
     */
    public ProduitEmballable(String nom, String code, double prix, double poids, boolean emballageBiodegradable) {
        super(nom, code, prix, poids);
        this.emballageBiodegradable = emballageBiodegradable;
    }

    /**
     * Retourne si l'emballage est biodégradable ou non.
     *
     * @return vrai si l'emballage est biodégradable, faux sinon
     */
    public boolean isEmballageBiodegradable() {
        return emballageBiodegradable;
    }

    /**
     * Définit si l'emballage est biodégradable ou non.
     *
     * @param emballageBiodegradable si l'emballage est biodégradable ou non
     */
    public void setEmballageBiodegradable(boolean emballageBiodegradable) {
        this.emballageBiodegradable = emballageBiodegradable;
    }
}
