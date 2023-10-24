package java_baleine_exo1;

import java.util.ArrayList;


import javaBaleines.Baleines;


public class Main {
    public static void main(String[] args) {
        //instance d un objet baleine3
        Baleine2 baleine3 = new Baleine2();
        // Création d'un ArrayList pour stocker les informations sur différentes espèces de baleines
        ArrayList<Baleine2> baleines = new ArrayList<>();
        

        // Ajout des informations sur les baleines à l'ArrayList
        baleines.add(new Baleine2("Baleine bleue", 30, 100, 15000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Rorqual commun", 20, 50, 100000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Cachalot", 18, 45, 550000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Baleine boréale", 18, 75, 10000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Baleine à bosse", 16, 40, 80000)); // Les chiffres sont des estimations
        
        // Ajout d'autres espèces de baleines à l'ArrayList
        baleines.add(new Baleine2("Béluga", 5.5, 1.5, 150000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Baleine de Minke", 10, 10, 800000)); // Les chiffres sont des estimations
        baleines.add(new Baleine2("Bérardie d'Arnoux", 12.5, 14, 50000)); // Les chiffres sont des estimations
        // On set l objet baleine3
        baleine3.setNom("Moby Dick");
        baleine3.setTaille(12);
        baleine3.setPoids(40);
        baleine3.setNombre(2);
        baleines.add(baleine3);
        // Affichage des informations sur les baleines
        for (Baleine2 baleine : baleines) {
            System.out.println(baleine);
        }
        Baleine2.afficherCetacesParPoidsTotal(baleines);
        Baleine2.afficherCetacesParNombre(baleines);
    }
}
