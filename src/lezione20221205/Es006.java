package lezione20221205;

import java.util.Scanner;

public class Es006 {
  /**
   * validity function checks the absence of not matching chars in the given phone number String, and if the char '+' has been eventually written more than once
   * @param n is the String with the phone number that needs to be checked
   * @return a boolean value: if true means it's a valid string, if false it means it's not
   */
  public static boolean validity (String n){
    int counter = 0;
    for (int i = 0; i < n.length(); i++) {
      char comparedChar = n.charAt(i);
      if ((comparedChar != '0') && (comparedChar != '1') && (comparedChar != '2') && (comparedChar != '3')
              && (comparedChar != '4') && (comparedChar != '5') && (comparedChar != '6') && (comparedChar != '7')
              && (comparedChar != '8') && (comparedChar != '9') && (comparedChar != '+') && (comparedChar != '-')
              && (comparedChar != ' ') && (comparedChar != '.')) {
        System.out.println(comparedChar);
        return false;
      }
      if (comparedChar == '+'){
        counter++;
      }
      if (counter > 1){
        return false;
      }
    }
    return true;
  }
  /**
   * compact function delete from the given phone number String all the useless chars like '-' or '.' and the empty spaces
   * @param n is the String with the phone number that needs to be checked
   * @return a String with the cleaned phone number
   */
  public static String compact (String n){
    n = n.replace(" ","");
    n = n.replace("-","");
    n = n.replace(".","");
    return n;
  }
  /**
   * prefix function returns a 2 value Array (where the [0] is the international prefix and the [1] is the national phone number) out of a given String, whether it starts with a '+' or a '00'. In case the prefix is missing it will automatically add the Italian international prefix
   * @param n is the String with the phone number that needs to be checked
   * @return an Array with the international prefix [0] and the national phone number [1]
   */
  public static String[] prefix (String n){
    char prefixFirstDigit = n.charAt(0);
    char prefixSecondDigit = n.charAt(1);
    int length = n.length();
    String[] phoneNr = new String[2];
    if (prefixFirstDigit == '+') {
      phoneNr[0] = n.substring(1,3);
      phoneNr[1] = n.substring(3,length);
      return phoneNr;
    }
    if (prefixFirstDigit == '0' && prefixSecondDigit == '0') {
      phoneNr[0] = n.substring(2,4);
      phoneNr[1] = n.substring(4,length);
      return phoneNr;
    }
    phoneNr[0] = "39";
    phoneNr[1] = n;
    return phoneNr;
  }
  /**
   * length function verify if the length of the given String is at least 10 chars
   * @param n is the String with the phone number that needs to be checked
   * @return a boolean value: if true means it's a valid string, if false it means it's not
   */
  public static boolean length (String n){
    if (n.length() >=10) {
      return true;
    }
    return false;
  }
  /**
   * sendMessage function sends a message to the given phone number. It doesn't return anything.
   * @param n is an array composed by the international prefix [0] and the national phone number [1]
   */
  public static void sendMessage (String[] n){
    System.out.println("inserisci il messaggio da inviare");
    try(Scanner scanner = new Scanner(System.in)){
      String message= scanner.nextLine();
      System.out.println("hai inviato il seguente messaggio '"+message+"' al numero +"+n[0]+n[1]);
      long numericNumber = Long.parseLong(n[1]); // la funzione parseLong, data una stringa, ritorna un numero long
      System.out.println("il numero in formato numerico senza prefisso internazionale è "+numericNumber);
    }
  }
  public static void main(String[] args) {
    System.out.println("inserisci il numero di telefono");
    Scanner scanner = new Scanner(System.in);
    String numero = scanner.nextLine();
    if (validity(numero) == false || length(prefix(compact(numero))[1]) == false) {
      System.out.println("Hai inserito un numero sbagliato");
    }
    else{
      System.out.println("Il numero inserito è valido");
      System.out.println("Il numero compresso è: "+compact(numero));
      System.out.println("Il prefisso internazionale è: "+prefix(compact(numero))[0]);
      System.out.println("Il numero di telefono senza prefisso è: "+prefix(compact(numero))[1]);
      sendMessage(prefix(compact(numero)));
    }
    scanner.close();
  }
}