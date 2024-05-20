import Components.Patisserie.Patisserie;
import Components.Produit.Category.ProduitLocal;
import Components.Produit.Produit;
import Components.Produit.Category.ProduitEmballable;
import Components.Produit.Category.ProduitPerissable;
import Components.Produit.Category.ProduitRefrigerable;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();

        ProduitEmballable gateau = new ProduitEmballable("Gateau", "001", 10.0, 0.5, true);

        ProduitPerissable pain = new ProduitPerissable("Pain", "002", 1.0, 0.5, 3);

        ProduitRefrigerable gateauGlace = new ProduitRefrigerable("Gateau glace", "003", 15.0, 0.5, -5.0);

        ProduitLocal confitDeCanard = new ProduitLocal("Confit de canard", "004", 20.0, 0.5, 365, LocalDate.now());

        ProduitLocal confiture = new ProduitLocal("Confiture", "005", 5.0, 0.5, 180, LocalDate.now());

        patisserie.ajouterProduit(gateau);
        patisserie.ajouterProduit(pain);
        patisserie.ajouterProduit(gateauGlace);
        patisserie.ajouterProduit(confitDeCanard);
        patisserie.ajouterProduit(confiture);

        for (Produit produit : patisserie.getProduits()) {
            System.out.println("-------------------------------------------------");
            System.out.println("Nom du produit : " + produit.getNom());
            System.out.println("Code du produit : " + produit.getCode());
            System.out.println("Prix du produit : " + produit.getPrix());
            System.out.println("Poids du produit : " + produit.getPoids());
            System.out.println("-------------------------------------------------");
        }
    }
}