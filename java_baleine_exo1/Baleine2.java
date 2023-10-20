package java_baleine_exo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baleine2 {
    private String nom;
    private double taille;
    private double poids;
    private int nombre;

    public Baleine2(String nom, double taille, double poids, int nombre) {
        this.nom = nom;
        this.taille = taille;
        this.poids = poids;
        this.nombre = nombre;
    }
    //constructeur sans paramètres
    public Baleine2(){
    }
      // Getter pour l'attribut 'nom'
    public String getNom() {
        return nom;
    }

    // Setter pour l'attribut 'nom'
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour l'attribut 'taille'
    public double getTaille() {
        return taille;
    }

    // Setter pour l'attribut 'taille'
    public void setTaille(double taille) {
        this.taille = taille;
    }

    // Getter pour l'attribut 'poids'
    public double getPoids() {
        return poids;
    }

    // Setter pour l'attribut 'poids'
    public void setPoids(double poids) {
        this.poids = poids;
    }

    // Getter pour l'attribut 'nombre'
    public int getNombre() {
        return nombre;
    }

    // Setter pour l'attribut 'nombre'
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public static void afficherCetacesParPoidsTotal(ArrayList<Baleine2> baleines) {
        Collections.sort(baleines, Comparator.comparingDouble(Baleine2::getPoids).reversed());

        System.out.println("Cétacés par ordre du poids total estimé:");
        for (Baleine2 baleine : baleines) {
            System.out.println(baleine.getNom() + " - Poids total estimé: " + baleine.getPoids() + " tonnes");
        }
    }
    public static void afficherCetacesParNombre(ArrayList<Baleine2> baleines) {
        Collections.sort(baleines, Comparator.comparingInt(Baleine2::getNombre).reversed());

        System.out.println("Cétacés par ordre de nombre:");
        for (Baleine2 baleine : baleines) {
            System.out.println(baleine.getNom() + " - Poids total estimé: " + baleine.getNombre() + " nombre d'individus");
        }
    }
    @Override
    public String toString() {
        return "Nom: " + nom + ", Taille: " + taille + " mètres, Poids: " + poids + " tonnes, Nombre: " + nombre;
    }
}