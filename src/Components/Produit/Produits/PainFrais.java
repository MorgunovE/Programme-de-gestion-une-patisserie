package Components.Produit.Produits;

import Components.Produit.Category.Emballable;
import Components.Produit.Category.Perissable;
import Components.Produit.Produit;

public class PainFrais extends Produit implements Emballable, Perissable {
    private boolean estEmballe;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     */
    public PainFrais(String nom, String code, double prix, double poids) {
        super(nom, code, prix, poids);
    }

    public void emballer() {
        estEmballe = true;
    }

    public String validerEtatEmballage() {
        return estEmballe ? "Le pain frais est emballé." : "Le pain frais n'est pas emballé.";
    }

    public String eliminerProduit() {
        return "Le pain frais a été jeté.";
    }

    public String verifierEtat() {
        return validerEtatEmballage();
    }
}
