package Components.Produit;

/**
 * Classe représentant un produit générique.
 */
public class Produit {
    private String nom;
    private String code;
    private double poids;
    private double prix;
    private String etiquette;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom   le nom du produit
     * @param code  le code du produit
     * @param prix  le prix du produit
     * @param poids le poids du produit
     */
    public Produit(String nom, String code, double prix, double poids) {
        this.prix = prix;
        this.nom = nom;
        this.code = code;
        this.poids = poids;
    }
    /**
     * Getter de l'attribut nom.
     *
     * @return le nom du produit
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de l'attribut nom.
     *
     * @param nom le nom du produit
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de l'attribut code.
     *
     * @return le code du produit
     */
    public String getCode() {
        return code;
    }
    /**
     * Setter de l'attribut code.
     *
     * @param code le code du produit
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter de l'attribut poids.
     *
     * @return le poids du produit
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Setter de l'attribut poids.
     *
     * @param poids le poids du produit
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * Getter de l'attribut prix.
     *
     * @return le prix du produit
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Setter de l'attribut prix.
     *
     * @param prix le prix du produit
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Getter de l'attribut etiquette.
     *
     * @return l'étiquette du produit
     */
    public String getEtiquette() {
        return etiquette;
    }

    /**
     * Setter de l'attribut etiquette.
     *
     * @param etiquette l'étiquette du produit
     */
    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }
}
