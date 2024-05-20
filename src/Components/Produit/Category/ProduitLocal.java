package Components.Produit.Category;

import Components.Produit.Produit;

import java.time.LocalDate;

public class ProduitLocal extends Produit {
    private int dureeDeConservation;
    private LocalDate dateDeMiseEnConserve;
    private LocalDate dateDeFinDeValidite;

    public ProduitLocal(String nom, String code, double prix, double poids, int dureeDeConservation, LocalDate dateDeMiseEnConserve) {
        super(nom, code, prix, poids);
        this.dureeDeConservation = dureeDeConservation;
        this.dateDeMiseEnConserve = dateDeMiseEnConserve;
        this.dateDeFinDeValidite = dateDeMiseEnConserve.plusDays(dureeDeConservation);
    }

    public int getDureeDeConservation() {
        return dureeDeConservation;
    }

    public void setDureeDeConservation(int dureeDeConservation) {
        this.dureeDeConservation = dureeDeConservation;
    }

    public LocalDate getDateDeMiseEnConserve() {
        return dateDeMiseEnConserve;
    }

    public void setDateDeMiseEnConserve(LocalDate dateDeMiseEnConserve) {
        this.dateDeMiseEnConserve = dateDeMiseEnConserve;
    }

    public LocalDate getDateDeFinDeValidite() {
        return dateDeFinDeValidite;
    }

    public void setDateDeFinDeValidite(LocalDate dateDeFinDeValidite) {
        this.dateDeFinDeValidite = dateDeFinDeValidite;
    }

}
