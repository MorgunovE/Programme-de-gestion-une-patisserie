package Components.Entreprise;

import Components.Produit.Produit;

public class EntrepriseEtiquetage {
    private String nom;
    private String siteWeb;
    private String coordonnees;

    public EntrepriseEtiquetage(String nom, String siteWeb, String coordonnees) {
        this.nom = nom;
        this.siteWeb = siteWeb;
        this.coordonnees = coordonnees;
    }

    public void etiqueterProduit(Produit produit) {
        String etiquette = "Nom du produit : " + produit.getNom() + '\n' +
                "Code du produit : " + produit.getCode() + '\n' +
                "Prix du produit : " + produit.getPrix() + '\n' +
                "Poids du produit : " + produit.getPoids() + '\n' +
                "Nom de l'entreprise : " + this.nom + '\n' +
                "Site web de l'entreprise : " + this.siteWeb + '\n' +
                "Coordonnees de l'entreprise : " + this.coordonnees + '\n';
        produit.setEtiquette(etiquette);
    }
}
