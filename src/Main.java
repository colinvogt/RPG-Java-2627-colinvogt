public class Main {
    public static void main(String[] args) {
       ConsoleIO io = new ConsoleIO();

       io.afficher("[1] Voir le héro\n" +
                         "[0] Quitter");
       int parts = io.lireInt();

       switch (parts) {
           case 1:
       }
    }
}
