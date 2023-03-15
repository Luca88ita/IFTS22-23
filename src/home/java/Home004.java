package home;

import java.util.Scanner;

/*
 * Program to help to count the change
 */
public class Home004 {
  public static void main(String[] args) {
    try(Scanner scn = new Scanner(System.in)){
      System.out.println("Inserisci quante monete da 5 centesimi hai in tasca");
      int fiveCent = scn.nextInt();
      System.out.println("Inserisci quante monete da 10 centesimi hai in tasca");
      int tenCent = scn.nextInt();
      System.out.println("Inserisci quante monete da 20 centesimi hai in tasca");
      int twentyCent = scn.nextInt();
      System.out.println("Inserisci quante monete da 50 centesimi hai in tasca");
      int fiftyCent = scn.nextInt();
      System.out.println("In tasca hai "+(0.05*fiveCent+0.10*tenCent+0.20*twentyCent+0.50*fiftyCent)+" Euro");
    }
  }
}
