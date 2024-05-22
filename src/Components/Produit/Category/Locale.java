package Components.Produit.Category;

import java.time.LocalDate;

public interface Locale {
    /**
     * Retourne la durée de conservation du produit.
     *
     * @return la durée de conservation du produit
     */
    int getDureeConservation();

    /**
     * Retourne la date de mise en conserve du produit.
     *
     * @return la date de mise en conserve du produit
     */
    LocalDate getDateMiseEnConserve();

    /**
     * Retourne la date de fin de validité du produit.
     *
     * @return la date de fin de validité du produit
     */
    LocalDate getDateFinValidite();
}
