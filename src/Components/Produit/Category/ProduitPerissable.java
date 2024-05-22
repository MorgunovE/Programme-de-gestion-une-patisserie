package Components.Produit.Category;

import Components.Produit.Produit;

import java.time.LocalDate;

/**
 * Classe représentant un produit périssable.
 * Un produit périssable est un produit qui a une durée de vie limitée.
 */
public class ProduitPerissable extends Produit {
    private int dureeDeVie;
    private LocalDate dateDePeremption;

    /**
     * Constructeur de la classe ProduitPerissable.
     *
     * @param nom         le nom du produit
     * @param code        le code du produit
     * @param prix        le prix du produit
     * @param poids       le poids du produit
     * @param dureeDeVie  la durée de vie du produit
     */
    public ProduitPerissable(String nom, String code, double prix, double poids, int dureeDeVie) {
        super(nom, code, prix, poids);
        this.dureeDeVie = dureeDeVie;
        this.dateDePeremption = LocalDate.now().plusDays(dureeDeVie);
    }

    /**
     * Retourne la durée de vie du produit.
     *
     * @return la durée de vie du produit
     */
    public int getDureeDeVie() {
        return dureeDeVie;
    }

    /**
     * Définit la durée de vie du produit.
     *
     * @param dureeDeVie la durée de vie du produit
     */
    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    /**
     * Élimine le produit si sa date de péremption est dépassée.
     *
     * @return une chaîne de caractères indiquant si le produit a été éliminé ou non
     */
    public String eliminerProduit() {
        if (LocalDate.now().isAfter(dateDePeremption)) {
            return "Le produit " + getNom() + " a été éliminé car sa date de péremption est dépassée..";
        }
        return "Le produit " + getNom() + " n'a pas été éliminé car sa date de péremption n'est pas encore dépassée.";
    }

    /**
     * Vérifie l'état actuel du produit et identifie s'il est toujours consommable.
     *
     * @return une chaîne de caractères indiquant si le produit est consommable ou non
     */
    public String verifierEtat() {
        if (LocalDate.now().isAfter(dateDePeremption)) {
            return "Le produit " + getNom() + " n'est plus consommable car sa date de péremption est dépassée..";
        }
        return "Le produit " + getNom() + " est toujours consommable.";
    }
}
