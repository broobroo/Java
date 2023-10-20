package javaExo1;

public class Etudiant{
    // Variables d'instance
    private int note;
    private String nom;

     // Constructeur
    public Etudiant(int note, String nom) {
        this.note = note;
        this.nom = nom;
    }

    // Méthodes getter
    public int getNote() {
        return this.note;
    }

    public String getNom() {
        return this.nom;
    }

    public boolean aReussi(){
        if(this.note >= 10){
            return true;
        }else return false;
    }
}