package Components.Produit.Category;

public interface Refrigerable {
    /**
     * Retourne si le produit est réfrigéré ou non.
     *
     * @return vrai si le produit est réfrigéré, faux sinon
     */
    String verifierTemperature(double temperatureActuelle);

    /**
     * Retourne la température optimale de conservation du produit.
     *
     * @return la température optimale de conservation du produit
     */
    double getTemperatureOptimale();
}
