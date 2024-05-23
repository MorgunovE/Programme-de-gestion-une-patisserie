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
     * Étiquette un produit avec les informations.
     *
     * @param produit le produit à étiqueter
     */
    public void etiqueterProduit(Produit produit) {
        StringBuilder etiquette = new StringBuilder();
        etiquette.append("Nom du produit : ").append(produit.getNom()).append('\n')
                .append("Code du produit : ").append(produit.getCode()).append('\n')
                .append("Prix du produit : ").append(produit.getPrix()).append('\n')
                .append("Poids du produit : ").append(produit.getPoids()).append('\n');

        if (produit instanceof Components.Produit.Category.Perissable) {
            Components.Produit.Category.Perissable produitPerissable = (Components.Produit.Category.Perissable) produit;
            etiquette.append("Durée de vie : ").append(produitPerissable.getDureeDeVie()).append('\n');
        }

        if (produit instanceof Components.Produit.Category.Refrigerable) {
            Components.Produit.Category.Refrigerable produitRefrigerable = (Components.Produit.Category.Refrigerable) produit;
            etiquette.append("Température optimale : ").append(produitRefrigerable.getTemperatureOptimale()).append('\n');
        }

        if (produit instanceof Components.Produit.Category.Emballable) {
            Components.Produit.Category.Emballable produitEmballable = (Components.Produit.Category.Emballable) produit;
            etiquette.append("Type d'emballage est biodegradable ou recyclable : ").append(produitEmballable.estBiodegradableOuRecyclable()).append('\n');
        }

        if (produit instanceof Components.Produit.Category.Locale) {
            Components.Produit.Category.Locale produitLocale = (Components.Produit.Category.Locale) produit;
            etiquette.append("Durée de conservation : ").append(produitLocale.getDureeConservation()).append('\n')
                    .append("Date de mise en conserve : ").append(produitLocale.getDateMiseEnConserve()).append('\n')
                    .append("Date de fin de validité : ").append(produitLocale.getDateFinValidite()).append('\n');
        }

        etiquette.append("Nom de l'entreprise : ").append(this.nom).append('\n')
                .append("Site web de l'entreprise : ").append(this.siteWeb).append('\n')
                .append("Coordonnees de l'entreprise : ").append(this.coordonnees).append('\n');

        produit.setEtiquette(etiquette.toString());
    }
}
