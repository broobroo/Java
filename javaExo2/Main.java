package javaExo2;

public class Main {
    public static void main(String[] args){
        Dinosaure dinosaure1 = new Dinosaure("T-rex", "Jurassique");
        String nom = dinosaure1.getNom();  // Retourne "T-rex"
        String periode = dinosaure1.getPeriode();  // Retourne "Jurassique"
        System.out.println(nom);
        System.out.println(periode);
    }
}