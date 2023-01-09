package lezione20221215;

import java.util.Scanner;

public class Es022 {
  public static boolean isPrime(long n){
    if (n<2){
      return false;
    }
    for (long i = 2; i <= n/i; i++) {
      if (n%i == 0){
        return false;
      }
    }
    return true;
  }
  public static long[] isPrime2(long n){
    long[] result = {0,0};
    if (n<2){
      result[0] = 1;
      return result;
    }
    for (long i = 2; i <= n/i; i++) {
      if (n%i == 0){
        result[0]=1;
        result[1]=i;
        return result;
      }
    }
    return result;
  }
  public static long allPrime(long n){
    long counter = 0;
    for (long i = 2; i <= n; i++) {
      if (isPrime(i)){
        counter++;
        //System.out.println(i);
      }
    }
    return counter;
  }

  public static long countSpecialCouples(long n, long d){
    long counter = 0;
    for (long i = 0; i <= n; i++) {
      if ((isPrime(i) && isPrime(i-d))){
        System.out.println("("+(i-d)+","+i+")");
        counter++;
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Scanner scn2 = new Scanner(System.in);
    String quit;
    char quitchar = 's';
    long[] result;
    do {
      //Scanner scn = new Scanner(System.in);
      System.out.println("Inserisci il numero da ricercare");
      long x = scn.nextLong();
      long start = System.nanoTime();
/*       if (isPrime(x)){
        //System.out.println("Il numero ricercato è il "+allPrime(x)+"° numero primo");
        System.out.println("Il numero ricercato è un numero primo");
      } else {
        System.out.println("Il numero ricercato non è primo");
      } */
      result = isPrime2(x);
      if (result[0]==0){
        System.out.println("Il numero ricercato è un numero primo");
      } else {
        if (x<2) {
          System.out.println("Il numero ricercato è inferiore a 2, quindi non può essere primo");
        } else {
          System.out.println("Il numero ricercato non è primo, perché è divisibile per "+result[1]);
        }
      }
      long stop = System.nanoTime();
      System.out.println("Il calcolo ha impiegato " + (stop - start) / 1000000 + " ms");
      //System.out.println("Tutti i numeri primi da 1 a "+x+" sono");
      //allPrime(x);
      System.out.println("*******************************");
      //System.out.println("I numeri primi gemelli fino a "+x+" sono "+countSpecialCouples(x,2));
      //System.out.println("I numeri primi cugini fino a "+x+" sono "+countSpecialCouples(x,4));
      //System.out.println("I numeri primi sexy fino a "+x+" sono "+countSpecialCouples(x,6));
      System.out.println("*******************************");
      System.out.println("Digita q e premi invio per uscire o invio per continuare");
      quit = scn2.nextLine();
      if (quit.equals("")) {
        quitchar = 'y';
      }else{
        quitchar = quit.charAt(0);
      }
    } while (quitchar !='q');
    scn.close();
    scn2.close();
  }
}
