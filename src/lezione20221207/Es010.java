package lezione20221207;

import java.util.Scanner;

public class Es010 {
    public static int max (int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        try(Scanner scanner = new Scanner(System.in)){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Inserisci il "+(i+1)+"° elemento dell'array");
                array[i]= scanner.nextInt();
            }
            System.out.print("Il numero maggiore tra i 5 inseriti è "+max(array));
        }
    }
}
