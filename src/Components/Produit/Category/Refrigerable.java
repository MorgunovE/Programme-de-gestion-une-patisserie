package Components.Produit.Category;

public interface Refrigerable {
    /**
     * Retourne si le produit est réfrigéré ou non.
     *
     * @return vrai si le produit est réfrigéré, faux sinon
     */
    String verifierTemperature(double temperatureActuelle);
}
