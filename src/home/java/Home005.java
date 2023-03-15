package home;

import java.util.Scanner;

/*
 * Program to count how many egg boxes of 12 eggs and egg grosses of 12 boxes given the number of eggs
 */
public class Home005 {
  public static int[] dozens(int n1) {
    int[] dozens = new int[2];
    dozens[0] = ((n1-(n1%12))/12);
    dozens[1] = n1%12;
    return dozens;
  }
  public static void main(String[] args) {
    try(Scanner scn = new Scanner(System.in)){
      System.out.println("Inserisci il numero di uova raccolte");
      int nEggs = scn.nextInt();
      int totBox = dozens(nEggs)[0];
      int leftEggs = dozens(nEggs)[1];
      System.out.println("Sono stati raccolti "+dozens(totBox)[0]+" bancali pieni più "+dozens(totBox)[1]+" cartoni di uova, e ne sono rimaste "+leftEggs+" sfuse");
    }
  }
}
