import Components.Patisserie.Patisserie;
import Components.Produit.Produit;
import Components.Produit.Category.ProduitEmballable;
import Components.Produit.Category.ProduitPerissable;
import Components.Produit.Category.ProduitRefrigerable;

public class Main {
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();

        ProduitEmballable gateau = new ProduitEmballable("Gateau", "001", 10.0, 0.5, true);

        ProduitPerissable pain = new ProduitPerissable("Pain", "002", 1.0, 0.5, 3);

        ProduitRefrigerable gateauGlace = new ProduitRefrigerable("Gateau glace", "003", 15.0, 0.5, -5.0);

        patisserie.ajouterProduit(gateau);
        patisserie.ajouterProduit(pain);
        patisserie.ajouterProduit(gateauGlace);

        for (Produit produit : patisserie.getProduits()) {
            System.out.println("Nom du produit : " + produit.getNom());
            System.out.println("Code du produit : " + produit.getCode());
            System.out.println("Prix du produit : " + produit.getPrix());
            System.out.println("Poids du produit : " + produit.getPoids());
        }
    }
}