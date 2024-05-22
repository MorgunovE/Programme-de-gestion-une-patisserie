package Components.Produit.Produits;

import Components.Produit.Category.Locale;
import Components.Produit.Produit;

import java.time.LocalDate;

public class ConfitureDeSaison extends Produit implements Locale {
    private int dureeConservation;
    private LocalDate dateMiseEnConserve;
    private LocalDate dateFinValidite;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     * @param dureeConservation la durée de conservation du produit
     * @param dateMiseEnConserve la date de mise en conserve du produit
     * @param dateFinValidite la date de fin de validité du produit
     */
    public ConfitureDeSaison(String nom, String code, double prix, double poids, int dureeConservation, LocalDate dateMiseEnConserve, LocalDate dateFinValidite) {
        super(nom, code, prix, poids);
        this.dureeConservation = dureeConservation;
        this.dateMiseEnConserve = dateMiseEnConserve;
        this.dateFinValidite = dateFinValidite;
    }

    @Override
    public int getDureeConservation() {
        return dureeConservation;
    }

    @Override
    public LocalDate getDateMiseEnConserve() {
        return dateMiseEnConserve;
    }

    @Override
    public LocalDate getDateFinValidite() {
        return dateFinValidite;
    }
}