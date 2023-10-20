package javaBaleines;

public class Main {
    public static void main(String[] args){
        Baleines.Balaenides baleineFranche = new Baleines.Balaenides();
        System.out.print("La ");
        baleineFranche.nomCommun();
        System.out.print(" est un cétacé.");
        baleineFranche.nager();
        System.out.print(" C'est aussi un mysticète.");
        baleineFranche.filtrerEau();
    }
}
