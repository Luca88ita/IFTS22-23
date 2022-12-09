package lezione20221207;

import java.util.Scanner;

public class Es012 {
    /**
     * Somma dei primi x numeri
     * @param n primi numeri da sommare
     * @return somma dei primi x numeri
     */
    public static int sum(int n){
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("inserisci il valore dell'ultimo valore da sommare");
            int numero1 = scanner.nextInt();
            System.out.println(sum(numero1));
        }
    }
}
