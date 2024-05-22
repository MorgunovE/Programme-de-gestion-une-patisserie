package Components.Entreprise;

import Components.Produit.Produit;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une pâtisserie.
 * Une pâtisserie est un lieu où sont fabriqués et vendus des produits.
 */
public class Patisserie {
    private List<Produit> produits;

    /**
     * Constructeur de la classe Patisserie.
     */
    public Patisserie() {
        this.produits = new ArrayList<>();
    }

    /**
     * Ajoute un produit à la liste des produits de la pâtisserie.
     *
     * @param produit le produit à ajouter
     */
    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    /**
     * Retourne la liste des produits de la pâtisserie.
     *
     * @return la liste des produits de la pâtisserie
     */
    public List<Produit> getProduits() {
        return produits;
    }
}
