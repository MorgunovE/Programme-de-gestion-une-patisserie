package Components.Produit.Category;

public interface Perissable {

    /**
     * Vérifie si le produit est périmé.
     *
     * @return vrai si le produit est périmé, faux sinon
     */
    String eliminerProduit();

    /**
     * Vérifie l'état du produit.
     *
     * @return une chaîne de caractères indiquant l'état du produit
     */
    String verifierEtat();

}
