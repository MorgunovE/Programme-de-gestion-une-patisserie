package Components.Entreprise;

import Components.Produit.Produit;

/**
 * Classe représentant une entreprise d'étiquetage.
 * Une entreprise d'étiquetage est responsable de l'étiquetage des produits.
 */
public class EntrepriseEtiquetage {
    private String nom;
    private String siteWeb;
    private String coordonnees;

    /**
     * Constructeur de la classe EntrepriseEtiquetage.
     *
     * @param nom         le nom de l'entreprise
     * @param siteWeb     le site web de l'entreprise
     * @param coordonnees les coordonnées de l'entreprise
     */
    public EntrepriseEtiquetage(String nom, String siteWeb, String coordonnees) {
        this.nom = nom;
        this.siteWeb = siteWeb;
        this.coordonnees = coordonnees;
    }

    /**
     * Étiquette un produit avec les informations de l'entreprise.
     *
     * @param produit le produit à étiqueter
     */
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
