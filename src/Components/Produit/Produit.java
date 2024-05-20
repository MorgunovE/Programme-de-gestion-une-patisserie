package Components.Produit;

public class Produit {
    private String nom;
    private String code;
    private double poids;
    private double prix;

    public Produit(String nom, String code, double prix, double poids) {
        this.prix = prix;
        this.nom = nom;
        this.code = code;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
