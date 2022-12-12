package lezione20221212;

import java.util.Scanner;
// raddoppiare valore array
// sommare valori array // int
// media valori array // double
// max
// min
public class Es016 {
    public static int[] arrayScan (){
        Scanner scn = new Scanner(System.in);
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("inserisci il "+(i+1)+"° valore");
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void arrayScan2 (int[] arr){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("inserisci il "+(i+1)+"° valore");
            arr[i] = scn.nextInt();
        }
    }
    public static int[] arrayRandom(){
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random()*10)+1);
        }
        return arr;
    }
    public static void arrayRandom2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random()*10)+1);
        }
    }
    public static int[] arraySequenziale(){
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1);
        }
        return arr;
    }
    public static void arraySequenziale2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1);
        }
    }
    public static void arrayPrint (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Il "+(i+1)+"° elemento dell'array è "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] v = new int[10];
        //int[] arrayScan = arrayScan();
        //int[] arrayRandom = arrayRandom();
        //int[] arraySequenziale = arraySequenziale();
        //arrayPrint(arrayScan);
        //arrayPrint(arrayRandom);
        //arrayPrint(arraySequenziale);
        arraySequenziale2(v);
        arrayPrint(v);
        arrayRandom2(v);
        arrayPrint(v);
        arrayScan2(v);
        arrayPrint(v);
    }
}
