package lezione20221212;

import java.util.Scanner;

public class Es018 {
  public static void task(){
    Scanner scn = new Scanner(System.in);
    String word = scn.nextLine();
    String wordUp = word.toUpperCase();
    System.out.println("Il nome inserito in maiuscolo è "+wordUp);
  }
  public static void main(String[] args) {
    char q;
    String quit;
    Scanner stop = new Scanner(System.in);
    do {
      task();
      System.out.println("Per uscire digita q");
      quit = stop.nextLine();
      //q = quit.charAt(0);
      if (/*q == 'q' ||*/ "quit".equals(quit)){
        break;
      }
    } while (true);
    stop.close();
  }
}
