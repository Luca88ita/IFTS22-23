package lezione20221207;

import java.util.Scanner;

public class Es013 {
    /**
     * Program to return the absolute of a number
     * @param n number to be converted
     * @return the abs of the number in the input
     */
    public static double abs(double n){
        if (n<=0){
            n = n*-1;
        }
        return n;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("inserisci il valore da rendere assoluto");
            double numero1 = scanner.nextDouble();
            System.out.println(abs(numero1));
        }
    }
}
