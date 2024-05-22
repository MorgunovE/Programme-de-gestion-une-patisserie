package Components.Produit.Category;

import Components.Produit.Produit;

import java.time.LocalDate;

/**
 * Classe représentant un produit local.
 * Un produit local est un produit qui a une durée de conservation spécifique,
 * une date de mise en conserve et une date de fin de validité.
 */
public class ProduitLocal extends Produit {
    private int dureeDeConservation;
    private LocalDate dateDeMiseEnConserve;
    private LocalDate dateDeFinDeValidite;

    /**
     * Constructeur de la classe ProduitLocal.
     *
     * @param nom                  le nom du produit
     * @param code                 le code du produit
     * @param prix                 le prix du produit
     * @param poids                le poids du produit
     * @param dureeDeConservation  la durée de conservation du produit
     * @param dateDeMiseEnConserve la date de mise en conserve du produit
     */
    public ProduitLocal(String nom, String code, double prix, double poids, int dureeDeConservation, LocalDate dateDeMiseEnConserve) {
        super(nom, code, prix, poids);
        this.dureeDeConservation = dureeDeConservation;
        this.dateDeMiseEnConserve = dateDeMiseEnConserve;
        this.dateDeFinDeValidite = dateDeMiseEnConserve.plusDays(dureeDeConservation);
    }

    /**
     * Retourne la durée de conservation du produit.
     *
     * @return la durée de conservation du produit
     */
    public int getDureeDeConservation() {
        return dureeDeConservation;
    }

    /**
     * Définit la durée de conservation du produit.
     *
     * @param dureeDeConservation la durée de conservation du produit
     */
    public void setDureeDeConservation(int dureeDeConservation) {
        this.dureeDeConservation = dureeDeConservation;
    }

    /**
     * Retourne la date de mise en conserve du produit.
     *
     * @return la date de mise en conserve du produit
     */
    public LocalDate getDateDeMiseEnConserve() {
        return dateDeMiseEnConserve;
    }

    /**
     * Définit la date de mise en conserve du produit.
     *
     * @param dateDeMiseEnConserve la date de mise en conserve du produit
     */
    public void setDateDeMiseEnConserve(LocalDate dateDeMiseEnConserve) {
        this.dateDeMiseEnConserve = dateDeMiseEnConserve;
    }

    /**
     * Retourne la date de fin de validité du produit.
     *
     * @return la date de fin de validité du produit
     */
    public LocalDate getDateDeFinDeValidite() {
        return dateDeFinDeValidite;
    }

    /**
     * Définit la date de fin de validité du produit.
     *
     * @param dateDeFinDeValidite la date de fin de validité du produit
     */
    public void setDateDeFinDeValidite(LocalDate dateDeFinDeValidite) {
        this.dateDeFinDeValidite = dateDeFinDeValidite;
    }

}
