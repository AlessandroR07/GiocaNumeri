//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class GiocaNumeri {
    public static void main(String[] args) {
        System.out.printf("Inizia il gioco \n");
        Giocatore g1 = new Giocatore("Mario");
        g1.start();
        Giocatore g2 = new Giocatore("Bross");
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException var4) {
            System.err.println("Errore");
        }

        System.out.println("Fine gioco!!!");
    }
}
