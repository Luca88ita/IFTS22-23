package home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Home008PrimeNumbers {
  /****************************************/
  public static boolean isPrime(int n, List<Integer> primes){
    for (int i:primes)
    {
      int tmp = n/i;
      if (n%i==0) {
        return false;
      }
       if (i >= tmp) { 
        return true;
      } 
    }
    return true;
  }
  /****************************************/
  public static List<Integer> primeNumbersSearch(int n) {
    List<Integer> s1 = new ArrayList<>(List.of(2));
    int counter = 0;
    for (int i = 3; counter < n; i++) {
      if (isPrime(i, s1)) {
        s1.add(i);
        counter++;
      }
    }
    return s1;
  }
  /****************************************/
  public static List<Integer> primeNumbersSearch2(int n) {
    List<Integer> s1 = new ArrayList<>(n);
    s1.add(2);
    int counter = 0;
    for (int i = 3; counter < n; i++) {
      if (isPrime(i, s1)) {
        s1.add(i);
        counter++;
      }
    }
    return s1;
  }
  /****************************************/
  public static void main(String[] args) {
    System.out.println("Inserisci la posizione del numero primo che ti interessa");
    try (Scanner scn = new Scanner(System.in)) {
      int input = scn.nextInt()-1;
      long start = System.nanoTime();
      //System.out.println("Il "+(input+1)+"° numero primo è "+primeNumbersSearch(input).get(input));
      System.out.println("Il "+(input+1)+"° numero primo è "+primeNumbersSearch2(input).get(input));
      long stop = System.nanoTime();
      System.out.println("Il calcolo ha impiegato "+(stop-start)/1000000+" ms");
    } catch (Exception e) {
      System.out.println("Hai inserito un valore non corretto. Per piacere inserisci un intero positivo a partire da 2");
    }
  }
}
