package lezione20221215;

import java.util.Scanner;

public class Es022 {
  public static boolean isPrime(int n){
    if (n<2){
      return false;
    }
    for (int i = 2; i <= n/2; i++) {
      if (n%i == 0){
        return false;
      }
    }
    return true;
  }
  public static void allPrime(int n){
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)){
        System.out.println(i);
      }
    }
  }

  public static int countSpecialCouples(int n, int d){
    int counter = 0;
    for (int i = 0; i <= n; i++) {
      if ((isPrime(i) && isPrime(i-d))){
        System.out.println("("+(i-d)+","+i+")");
        counter++;
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    do {
      System.out.println("Inserisci il numero da ricercare");
      int x = scn.nextInt();
      if (isPrime(x) == true){
        System.out.println("Il numero ricercato è primo");
      } else {
        System.out.println("Il numero ricercato non è primo");
      }
      System.out.println("Tutti i numeri primi da 1 a "+x+" sono");
      allPrime(x);
      allPrime(x);
      System.out.println("*******************************");
      System.out.println("I numeri primi gemelli fino a "+x+" sono "+countSpecialCouples(x,2));
      System.out.println("I numeri primi cugini fino a "+x+" sono "+countSpecialCouples(x,4));
      System.out.println("I numeri primi sexy fino a "+x+" sono "+countSpecialCouples(x,6));
    } while (true);
  }
}
