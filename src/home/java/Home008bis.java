package home;

import java.util.Scanner;

public class Home008bis {
  /****************************************/
  public static boolean isPrime(int n, int[] primes) {
    for (int i = 0; i < primes.length; i++) {
      int tmp = n / primes[i];
      if (n % primes[i] == 0) {
        return false;
      }
      if (primes[i] >= tmp) {
      //if (primes[i] >= Math.sqrt(n)) {
        return true;
      }
    }
    return true; 
  }
  /****************************************/
  public static boolean isPrime2(int n){
    if (n<2){
      return false;
    }
    for (int i = 2; i <= n/i; i++) {
      if (n%i == 0){
        return false;
      }
    }
    return true;
  }
  /****************************************/
  public static int[] primeNumbersSearch(int n) {
    int[] s1 = new int[n];
    s1[0]=2;
    int counter = 1;
    for (int i = 2; counter < n; i++) {
      if (isPrime(i, s1)) {
        s1[counter] = i;
        counter++;
      }
    }
    return s1;
  }
  /****************************************/
  public static int[] primeNumbersSearch2(int n) {
    int[] s1 = new int[n];
    s1[0]=2;
    int test = 3;
    for (int i = 1; i < n; test++) {
      if (isPrime(test, s1)) {
        s1[i] = test;
        i++;
      }
      test++;
    }
    return s1;
  }
  /****************************************/
  public static int[] primeNumbersSearch3(int n) {
    int[] s1 = new int[n];
    s1[0]=2;
    int test = 2;
    for (int i = 0; i < n; test++) {
      if (isPrime2(test)) {
        s1[i] = test;
        i++;
      }
    }
    return s1;
  }
  /****************************************/
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    System.out.println("Inserisci la posizione del numero primo che ti interessa");
    try (Scanner scn = new Scanner(System.in)) {
      int input = scn.nextInt();
      long start = System.nanoTime();
      //printArray(primeNumbersSearch(input));
      //System.out.println("Il "+input+"° numero primo è "+primeNumbersSearch2(input)[input-1]);
      //int out=(primeNumbersSearch2(input)[input-1]);
      int out=(primeNumbersSearch2(input)[input-1]);
      System.out.printf("Il %,d° numero primo è %,d %n", input, out);
      long stop = System.nanoTime();
      System.out.println("Il calcolo ha impiegato " + (stop - start) / 1000000 + " ms");
    } catch (Exception e) {
      System.out.println("Hai inserito un valore non corretto. Per piacere inserisci un intero positivo");
    }
  }
}


/*
 * fare un algoritmo per dirmi se numero è primo
 * per farlo bisogna che mi salvo una lista con i numeri primi trovati a partire da 2
 * il limite massimo della ricerca prima di essere sicuro che ho trovato un numero primo, è sqrt(numero ricercato).
 * la ricerca stessa può essere limitata ai numeri dispari che non terminano con 5
 */