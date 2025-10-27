//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Giocatore extends Thread {
    int punteggio = 0;
    private String nome;
    public int num;
    GameManager gm;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    private void gioca() {
        System.out.println("Inserisci un numero: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println("Ho scelto il numero " + num);
        this.gm.verifica(num);
    }

    private void comunica() {
        System.out.println("Sono il giocatore " + this.nome + " e ho iniziato il gioco!");
        System.out.println(this);
    }

    public void run() {
        this.comunica();

        try {
            sleep(5000L);
        } catch (InterruptedException var2) {
            System.out.println("Errore nella fase di sleeping");
        }

        this.gioca();
    }
}
