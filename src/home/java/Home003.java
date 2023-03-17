package home.java;

import java.util.Scanner;

/*
 * Program asking username and greet by name in uppercase
 */
public class Home003 {
  public static void main(String[] args) {
    System.out.println("Inserisci il tuo nome");
    try (Scanner scn = new Scanner(System.in)) {
      String nome = scn.nextLine();
      System.out.println("Ciao " + nome.toUpperCase() + ", piacere di conoscerti!");
    }
  }
}
