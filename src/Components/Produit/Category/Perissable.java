package Components.Produit.Category;

import java.time.LocalDate;

public interface Perissable {

    /**
     * Retourne la durée de vie du produit.
     *
     * @return la durée de vie du produit
     */
    int getDureeDeVie();

    /**
     * Retourne la date de préparation du produit.
     *
     * @return la date de préparation du produit
     */
    LocalDate getDateDePreparation();

    /**
     * Vérifie si le produit est périmé.
     *
     * @return vrai si le produit est périmé, faux sinon
     */
    String eliminerProduit();

    /**
     * Vérifie l'état du produit.
     *
     * @return l'état du produit
     */
    Boolean verifierEtat();

    /**
     * Vérifie si le produit est consommable.
     *
     * @return vrai si le produit est consommable, faux sinon
     */
    Boolean estConsommable();

}
