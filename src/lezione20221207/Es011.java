package lezione20221207;

import java.util.Scanner;

public class Es011 {
    /*
    * moltiplicazione tramite ciclo while
    * */
    public static double moltiplicazione2(double n, double m){
        double result=0;
        int i=0;
        while (i<m){
            i++;
            result = result+n;
        }
        return result;
    }
    /*
     * moltiplicazione tramite ciclo for
     * */
    public static double moltiplicazione(double n, double m){
        double result = 0;
        for (int i = 0; i < m; i++) {
            result = result+n;
        }
        return (result);
    }

    public static int divisione(double n, double m){
        int i;
        for (i = 0; m <= n; i++) {
        n = n-m;
        }
//        i=0;
//        while (m<=n){
//            i = i++;
//            n = n-m;
//        }
        return i;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("inserisci il valore da moltiplicare");
            double numero1 = scanner.nextDouble();
            System.out.println("inserisci il moltiplicatore");
            double numero2 = scanner.nextDouble();
            System.out.println(numero1+" x "+ numero2+" = "+moltiplicazione2(numero1,numero2));
            System.out.println(numero1+" / "+numero2+" = "+divisione(numero1, numero2));
        }

    }
}
