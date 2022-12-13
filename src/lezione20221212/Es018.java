package lezione20221212;

import java.util.Scanner;

public class Es018 {
  public static void task(String word){
    String wordUp = word.toUpperCase();
    System.out.println("Il nome inserito in maiuscolo è "+wordUp);
  }
  public static void main(String[] args) {
    //char q;
    String quit;
    Scanner scn = new Scanner(System.in);
    do {
      System.out.println("Inserisci un nome in minuscolo");
      String word = scn.nextLine();
      task(word);
      System.out.println("Per uscire scrivi quit"); /* digita q"); */
      quit = scn.nextLine();
      //q = quit.charAt(0);
      if (/*q == 'q' ||*/ "quit".equals(quit)){
        break;
      }
    } while (true);
    scn.close();
  }
}
