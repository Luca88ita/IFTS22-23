package home;

import java.util.Scanner;

public class Home006 {
  public static void signature(String str) {
    String[] splitName = str.split(" ", 0);
    System.out.println("Il tuo nome è "+splitName[0]+", ed è composto da "+splitName[0].length()+" lettere");
    System.out.println("Il tuo cognome è "+splitName[1]+", ed è composto da "+splitName[1].length()+" lettere");
    System.out.println("Le tue iniziali sono "+splitName[0].charAt(0)+splitName[1].charAt(0));
  }
  public static void main(String[] args) {
    try(Scanner scn = new Scanner(System.in)){
      System.out.println("Inserisci il nome e cognome separato da uno spazio");
      String fullName = scn.nextLine();
      signature(fullName);
    }
  }
}
