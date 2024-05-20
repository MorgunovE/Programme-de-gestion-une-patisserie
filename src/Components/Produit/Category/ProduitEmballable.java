package Components.Produit.Category;

import Components.Produit.Produit;

public class ProduitEmballable extends Produit {
    private boolean emballageBiodegradable;

    public ProduitEmballable(String nom, String code, double prix, double poids, boolean emballageBiodegradable) {
        super(nom, code, prix, poids);
        this.emballageBiodegradable = emballageBiodegradable;
    }

    public boolean isEmballageBiodegradable() {
        return emballageBiodegradable;
    }

    public void setEmballageBiodegradable(boolean emballageBiodegradable) {
        this.emballageBiodegradable = emballageBiodegradable;
    }
}
