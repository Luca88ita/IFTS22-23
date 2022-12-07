package lezione20221207;

import java.util.Scanner;

/*
* Richiede all'utente di inserire 2 numeri interi.
* I 2 numeri interi vengono passati ad una funzione.
* Questa funzione verifica quale dei 2 è maggiore e lo ritorna.
* */
public class Es009 {
    /**
     * Funzione per trovare il numero maggiore tra i 2 numeri interi dati
     * @param a primo numero intero
     * @param b secndo numero intero
     * @return max tra i 2 numeri
     */
    public static int max (int a, int b){
        int max = a;
        if (a<b){
            max=b;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("inserisci il primo numero da confrontare");
        int n1 = scn.nextInt();
        System.out.println("inserisci il secondo numero da confrontare");
        int n2 = scn.nextInt();
        System.out.println("Il numero maggiore è "+max(n1,n2));
    }
}
