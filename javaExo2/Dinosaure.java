package javaExo2;

public class Dinosaure{
    // Variables d'instance
    private String nom;
    private String periode;

     // Constructeur
    public Dinosaure(String nom, String periode) {
        this.nom = nom;
        this.periode = periode;
        
    }

    // Méthodes getter
    public String getNom() {
        return this.nom;
    }

    public String getPeriode() {
        return this.periode;
    }


}