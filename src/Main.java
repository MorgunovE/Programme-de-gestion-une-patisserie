import Components.Entreprise.Patisserie;
import Components.Produit.Category.Locale;
import Components.Produit.Category.Perissable;
import Components.Produit.Produit;
import Components.Produit.Produits.*;
import Components.Entreprise.EntrepriseEtiquetage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Créer des produits valides
        Gateau gateauValide = new Gateau("Gateau", "001", 10.0, 1.0, 5, 1.0, "Recyclable", LocalDate.now());
        GateauGlace gateauGlaceValide = new GateauGlace("Gateau Glace", "002", 15.0, 1.5, 14, 1.5, "Recyclable", LocalDate.now());
        PainFrais painFraisValide = new PainFrais("Pain Frais", "003", 2.0, 0.5, 2, "Biodegradable", LocalDate.now());
        ConfitureDeSaison confitureDeSaisonValide = new ConfitureDeSaison("Confiture de saison", "004", 5.0, 0.3, 365, LocalDate.now());
        ConfitDeCanard confitDeCanardValide = new ConfitDeCanard("Confit de canard", "005", 20.0, 2.0, 180, LocalDate.now());

        // Créer des produits invalides
        Gateau gateauInvalide = new Gateau("Gateau Invalide", "006", 10.0, 1.0, 4, 10.0,"Recyclable",LocalDate.now().minusDays(13));
        GateauGlace gateauGlaceInvalide = new GateauGlace("Gateau Glace Invalide", "007", 15.0, 1.5, 14, 1.5, "Recyclable", LocalDate.now().minusDays(30));
        PainFrais painFraisInvalide = new PainFrais("Pain Frais Invalide", "008", 2.0, 0.5, 2, "Biodegradable", LocalDate.now().minusDays(10));
        ConfitureDeSaison confitureDeSaisonInvalide = new ConfitureDeSaison("Confiture de saison Invalide", "009", 5.0, 0.3, 365, LocalDate.now().minusDays(500));
        ConfitDeCanard confitDeCanardInvalide = new ConfitDeCanard("Confit de canard Invalide", "010", 20.0, 2.0, 180, LocalDate.now().minusDays(365));

        // Liste des produits
        List<Produit> produits = new ArrayList<>();
        produits.add(gateauValide);
        produits.add(gateauGlaceValide);
        produits.add(painFraisValide);
        produits.add(confitureDeSaisonValide);
        produits.add(confitDeCanardValide);
        produits.add(gateauInvalide);
        produits.add(gateauGlaceInvalide);
        produits.add(painFraisInvalide);
        produits.add(confitureDeSaisonInvalide);
        produits.add(confitDeCanardInvalide);


        // Vérifier la validité et la possibilité de consommation de chaque produit


        // Créer une entreprise d'étiquetage
        EntrepriseEtiquetage entrepriseEtiquetage = new EntrepriseEtiquetage("Patisserie", "www.Patisserie-example-site-web.com", "rue 123, Montreal, QC, H1H 1H1");

        // Créer une pâtisserie
        Patisserie patisserie = new Patisserie(produits, entrepriseEtiquetage);

        // Afficher les produits de la pâtisserie
        for (Produit produit : patisserie.getProduits()) {
            if (produit instanceof Perissable && ((Perissable) produit).estConsommable() || produit instanceof Locale && ((Locale) produit).getDateFinValidite().isAfter(LocalDate.now())) {
                System.out.println("-------------------------");
                System.out.println(produit.getEtiquette());
                System.out.println("-------------------------");
            }
        }


    }
}