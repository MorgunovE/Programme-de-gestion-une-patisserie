import Components.Entreprise.EntrepriseEtiquetage;
import Components.Entreprise.Patisserie;
import Components.Produit.Category.ProduitLocal;
import Components.Produit.Produit;
import Components.Produit.Produits.Gateau;
import Components.Produit.Produits.GateauGlace;
import Components.Produit.Produits.PainFrais;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patisserie patisserie = new Patisserie();

        Gateau gateau = new Gateau("Gâteau", "001", 10.0, 0.5);

        PainFrais pain = new PainFrais("Pain", "002", 2.0, 0.5);

        GateauGlace gateauGlace = new GateauGlace("Gâteau glacé", "003", 15.0, 0.5);

        // Emballage des produits
        gateau.emballer();
        gateauGlace.emballer();
        pain.emballer();


        // Vérification de l'état de l'emballage
        System.out.println(gateau.validerEtatEmballage());
        System.out.println(gateauGlace.validerEtatEmballage());
        System.out.println(pain.validerEtatEmballage());


        // Vérification de la température pour les produits réfrigérables
        System.out.println(gateau.verifierTemperature(4.0));
        System.out.println(gateauGlace.verifierTemperature(-20.0));

        // Vérification de l'état des produits
        System.out.println(gateau.verifierEtat());
        System.out.println(gateauGlace.verifierEtat());
        System.out.println(pain.verifierEtat());


        ProduitLocal confitDeCanard = new ProduitLocal("Confit de canard", "004", 20.0, 0.5, 365, LocalDate.now());

        ProduitLocal confiture = new ProduitLocal("Confiture", "005", 5.0, 0.5, 180, LocalDate.now());

        patisserie.ajouterProduit(gateau);
        patisserie.ajouterProduit(pain);
        patisserie.ajouterProduit(gateauGlace);
        patisserie.ajouterProduit(confitDeCanard);
        patisserie.ajouterProduit(confiture);

        EntrepriseEtiquetage entrepriseEtiquetage = new EntrepriseEtiquetage("Patisserie", "www.patisserie-site-web.com", "123 rue de patisserie");

        for (Produit produit : patisserie.getProduits()) {
            System.out.println("-------------------------------------------------");
            entrepriseEtiquetage.etiqueterProduit(produit);
            System.out.println(produit.getEtiquette());
            System.out.println("-------------------------------------------------");
        }
    }
}