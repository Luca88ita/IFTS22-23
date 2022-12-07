package lezione20221207;

import java.util.Scanner;

public class Es014 {
    public static double es14(double n){
        n=4.0 * (1 - (n/3) + (n/5) - (n/7) + (n/9) - (n/11));
        return n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("inserisci il valore n");
        double n1=scn.nextDouble();
        System.out.println("Il risultato della funzione è "+es14(n1));
    }
}
