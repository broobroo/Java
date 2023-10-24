package java_exo_gpt3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        int sommeTab=0;
        int[] tab={5,10,15,20};
        for(int i=0;i< tab.length;i++){
            sommeTab+=tab[i];
        }
        System.out.println("La somme de tous les nombres du tableau est : " + sommeTab);
    }
}
