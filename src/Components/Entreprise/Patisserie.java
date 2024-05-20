package Components.Entreprise;

import Components.Produit.Produit;

import java.util.ArrayList;
import java.util.List;

public class Patisserie {
    private List<Produit> produits;

    public Patisserie() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
