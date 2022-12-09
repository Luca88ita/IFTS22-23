package lezione20221207;

import java.util.Scanner;
/*
* tabellina di un numero dato
* */

public class Es015 {
    public static void tabellina (int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(n+" x "+(i+1)+" = "+n*(i+1));
        }
    }
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.println("inserisci il valore n");
            int n1=scn.nextInt();
            System.out.println("----------------");
            tabellina(n1);
        }

    }
}
