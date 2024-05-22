package Components.Produit.Category;

public interface Emballable {
    /**
     * Emballe le produit.
     */
    void emballer();

    /**
     * Retourne si le produit est biodégradable ou recyclable.
     *
     * @return vrai si le produit est biodégradable ou recyclable, faux sinon
     */
    String estBiodegradableOuRecyclable();

    /**
     * Retourne si le produit est emballé ou non.
     *
     * @return vrai si le produit est emballé, faux sinon
     */
    String validerEtatEmballage();
}
