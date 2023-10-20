package javaBaleines;

public class Baleines {
    // Classe de base Cetace
    public static class Cetace {
        public void nager() {
            System.out.print("Le cétacé nage...");
        }
    }
    // Sous-classe Mysticetes (baleines à fanons) héritant de Cetace
    public static class Mysticetes extends Cetace {
        
        public void filtrerEau() {
            System.out.print("Le mysticète filtre l'eau pour se nourrir...");
        }
    }
    // Sous-classe Eschrichtiides 
    public static class Eschrichtiides extends Mysticetes {
        public void nomCommun() {
            System.out.print("Baleines Grises");
        }
    }
    // Sous-classe Balaenidés 
    public static class Balaenides extends Mysticetes {
        public void nomCommun() {
            System.out.print("Baleines Franches");
        }
    }
    // Sous-classe Néobalaenidés 
    public static class Neobalaenides extends Mysticetes {
        public void nomCommun() {
            System.out.print("Baleines Pygmées");
        }
    }
}
