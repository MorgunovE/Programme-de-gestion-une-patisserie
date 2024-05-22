package Components.Entreprise;

import Components.Produit.Produit;

import java.util.List;

/**
 * Classe représentant une pâtisserie.
 * Une pâtisserie est un lieu où sont fabriqués et vendus des produits.
 * Elle possède une liste de produits et une entreprise d'étiquetage.
 */
public class Patisserie {
    private List<Produit> produits;
    private EntrepriseEtiquetage entrepriseEtiquetage;

    /**
     * Constructeur de la classe Patisserie.
     * @param produits la liste des produits de la pâtisserie
     * @param entrepriseEtiquetage l'entreprise d'étiquetage de la pâtisserie
     */
    public Patisserie(List<Produit> produits, EntrepriseEtiquetage entrepriseEtiquetage) {
        this.produits = produits;
        this.entrepriseEtiquetage = entrepriseEtiquetage;
        etiqueterProduits();
    }

    /**
     * This method is responsible for applying labels to all products in the patisserie.
     */
    private void etiqueterProduits() {
        for (Produit produit : produits) {
            entrepriseEtiquetage.etiqueterProduit(produit);
        }
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
