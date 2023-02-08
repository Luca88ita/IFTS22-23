package javaChallengesBook;

public class Es007b {

  public static String arabToRoman(int remains, int counter){
    if (remains == 1) {
      if (counter == 0) return "I";
      if (counter == 1) return "X";
      if (counter == 2) return "C";
      if (counter == 3) return "M";
    }
    if (remains == 2) {
      if (counter == 0) return "II";
      if (counter == 1) return "XX";
      if (counter == 2) return "CC";
      if (counter == 3) return "MM";
    }
    if (remains == 3) {
      if (counter == 0) return "III";
      if (counter == 1) return "XXX";
      if (counter == 2) return "CCC";
      if (counter == 3) return "MMM";
    }
    if (remains == 4) {
      if (counter == 0) return "IV";
      if (counter == 1) return "XL";
      if (counter == 2) return "CD";
    }
    if (remains == 5) {
      if (counter == 0) return "V";
      if (counter == 1) return "L";
      if (counter == 2) return "D";
    }
    if (remains == 6) {
      if (counter == 0) return "VI";
      if (counter == 1) return "LX";
      if (counter == 2) return "DC";
    }
    if (remains == 7) {
      if (counter == 0) return "VII";
      if (counter == 1) return "LXX";
      if (counter == 2) return "DCC";
    }
    if (remains == 8) {
      if (counter == 0) return "VIII";
      if (counter == 1) return "LXXX";
      if (counter == 2) return "DCCC";
    }
    if (remains == 9) {
      if (counter == 0) return "IX";
      if (counter == 1) return "XC";
      if (counter == 2) return "CM";
    }
    return "";
  }

  public static String returnRoman(int numero){
    String romano = "";
    int control = numero;
    if (control>3999) return "Hai inserito un numero troppo alto; il valore massimo inseribile è 3999";
    if (control<=0) return "Inserisci un valore positivo tra 1 e 3999";
    for (int i = 0; control > 0; i++) {
      int temp = control%10;
      romano = arabToRoman(temp,i).concat(romano);
      control = control/10;
    }
    return romano;
  }

  public static void main(String[] args) {
    int test = 444;
    System.out.println(returnRoman(test));
  }
}
