import Components.Entreprise.EntrepriseEtiquetage;
import Components.Entreprise.Patisserie;
import Components.Produit.Produit;
import Components.Produit.Produits.Gateau;
import Components.Produit.Produits.GateauGlace;
import Components.Produit.Produits.PainFrais;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();

        EntrepriseEtiquetage entrepriseEtiquetage = new EntrepriseEtiquetage("Patisserie", "www.patisserie-site-web.com", "123 rue de patisserie");

        for (Produit produit : patisserie.getProduits()) {
            System.out.println("-------------------------------------------------");
            entrepriseEtiquetage.etiqueterProduit(produit);
            System.out.println(produit.getEtiquette());
            System.out.println("-------------------------------------------------");
        }
    }
}