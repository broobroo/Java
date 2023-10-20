package javaChien;

public class Main {
    public static void main(String[] args) {
        // Instanciation de la classe Chien
        Chien monChien = new Chien();
        // Instanciation de la classe Chat
        Chat monChat = new Chat();
        // Appel de la méthode aboyer
        monChien.aboyer();  // Affiche "Woof!"
        // Appel de la méthode aboyerDouble
        monChien.aboyerDouble();  // Affiche "Woof! Woof!"
        // Appel de la méthode miauler
        monChat.miauler(); // Affiche "Miaou!"
        // Appel de la méthode aboyerDouble
        monChat.miaulerDouble();  // Affiche "Miaou! Miaou!"
    }
}
