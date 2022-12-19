package verifica20221219;

import java.util.Scanner;

public class Es004 {
  public static int divisibileFor(int[] arr,int n){
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]%n==0){
        counter++;
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    int[] arr = {124,234,5476,657,44,3463,34,2145,54,32};
    System.out.println("Inserisci il divisore da ricercare");
    int n = scn.nextInt();
    if (n>0){
      int result = divisibileFor(arr,n);
      if (result>0){
        System.out.println("All'interno dell'array, i numeri divisibili per "+n+" sono "+result);
      }else {
        System.out.println("Non ci sono numeri divisibili per "+n+" all'interno dell'array");
      }
    }else {
      System.out.println("Non mi piacciono i valori minori o uguali a zero... inserisci un numero intero valido");
    }
  }
}
