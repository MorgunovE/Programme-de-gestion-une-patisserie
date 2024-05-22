package Components.Produit.Category;

public interface Perissable {

    /**
     * Retourne la durée de vie du produit.
     *
     * @return la durée de vie du produit
     */
    int getDureeDeVie();

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

    /**
     * Vérifie si le produit est consommable.
     *
     * @return vrai si le produit est consommable, faux sinon
     */
    String estConsommable();

}
