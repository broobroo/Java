package java_exo_gpt1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //création de l'objet scanner avec system.in qui est le flux d'entrée
        // cela signifie que les réponses de l utilisateur seront lu à partir de la console
        Scanner scanner= new Scanner(System.in);
        // Demande dans le terminal + captation du nombre 1
        System.out.println("Entrez le nombre 1 :");
        int nombre1 = scanner.nextInt() ;
        // Demande dans le terminal + captation du nombre 2
        System.out.println("Entrez le nombre 2 :");
        int nombre2 = scanner.nextInt() ;
        // Somme des deux nombres
        int somme= nombre1 + nombre2;
        // Affichage du résultat
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est " + somme);
        //fermeture du scanner
        scanner.close();
    }
}
