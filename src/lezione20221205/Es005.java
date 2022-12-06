package lezione20221205;
/*
* Esercizio per l'input da tastiera
* */

import java.io.InputStream;
import java.util.Scanner;

public class Es005 {
    /*programma per comunicare in output la scuola che si fa in base all'età data in input
     * */
    public static void attSchool(float age){
        if (age<0){
            System.out.println("Hai inserito un'età impossibile");
        } else if (age<4) {
            System.out.println("In teoria stai andando al nido");
        } else if (age<6) {
            System.out.println("In teoria stai andando all'asilo");
        } else if (age<11) {
            System.out.println("In teoria stai andando alle elementari");
        } else if (age<14) {
            System.out.println("In teoria stai andando alle medie");
        } else if (age<19) {
            System.out.println("In teoria stai andando alle superiori");
        } else if (age<23) {
            System.out.println("In teoria stai frequentando la triennale");
        } else if (age<25) {
            System.out.println("In teoria stai frequentando la specialistica");
        }  else if (age<68) {
            System.out.println("In teoria stai lavorando");
        }  else {
            System.out.println("Dovresti esser pensionato");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float eta = scanner.nextFloat();
        attSchool(eta);
    }
}
