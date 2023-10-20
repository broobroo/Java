package javaExo1;

public class Main {
    public static void main(String[] args){
        Etudiant monEtudiant = new Etudiant(9, "Axelleboloss");
        int note = monEtudiant.getNote();  // Retourne "12"
        String nom = monEtudiant.getNom();  // Retourne "Axel"
        boolean aReussi = monEtudiant.aReussi();
        System.out.println(note);
        System.out.println(nom);
        System.out.println(aReussi);
    }
}
