package lezione20221205;
/*
 * Esercii sugli array
 * */

//import java.sql.Array;
import java.util.Scanner;

public class Es007 {

    // stampa tutti i valori dell'array
    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // stampa media dei valori di un'array
    public static void avgArray (int[] arr){
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        System.out.println(avg/arr.length);
    }
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int[] array = new int[5];

            for (int i = 0; i < array.length; i++) {
                System.out.println("Inserisci il "+(i+1)+"° elemento dell'array");
                array[i]= scanner.nextInt();
            }
            printArray(array);
            avgArray(array);
        }
    }
}
