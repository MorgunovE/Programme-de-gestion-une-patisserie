package Components.Produit.Category;

import Components.Produit.Produit;

/**
 * Classe représentant un produit emballable.
 * Un produit emballable est un produit qui a un emballage biodégradable ou recyclable et doit être emballé avant d'être mis en vente.
 */
public class ProduitEmballable extends Produit {
    private boolean emballageBiodegradable;
    private boolean estEmballer;
    private boolean estRecyclable;

    /**
     * Constructeur de la classe ProduitEmballable.
     *
     * @param nom                  le nom du produit
     * @param code                 le code du produit
     * @param prix                 le prix du produit
     * @param poids                le poids du produit
     * @param emballageBiodegradable si l'emballage est biodégradable ou non
     * @param estRecyclable si l'emballage est recyclable ou non
     */
    public ProduitEmballable(String nom, String code, double prix, double poids, boolean emballageBiodegradable, boolean estRecyclable) {
        super(nom, code, prix, poids);
        this.emballageBiodegradable = emballageBiodegradable;
        this.estEmballer = false;
        this.estRecyclable = estRecyclable;
    }

    /**
     * Emballe le produit.
     */
    public void emballer() {
        this.estEmballer = true;
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

    /**
     * Retourne si l'emballage est recyclable ou non.
     *
     * @return vrai si l'emballage est recyclable, faux sinon
     */
    public boolean isEstRecyclable() {
        return estRecyclable;
    }

    /**
     * Définit si l'emballage est recyclable ou non.
     *
     * @param estRecyclable si l'emballage est recyclable ou non
     */
    public void setEstRecyclable(boolean estRecyclable) {
        this.estRecyclable = estRecyclable;
    }

    /**
     * Valide l'état de l'emballage.
     *
     * @return une chaîne de caractères représentant l'état de l'emballage
     */
    public String validerEtatEmballage() {
        if (!this.estEmballer) {
            return "Le produit n'est pas encore emballé.";
        } else if(this.emballageBiodegradable){
            return "Le produit est emballé avec un emballage biodégradable.";
        } else if(this.estRecyclable){
            return "Le produit est emballé avec un emballage recyclable.";
        } else {
            return "Le produit est emballé, mais l'emballage n'est ni biodégradable ni recyclable.";
        }
    }
}
