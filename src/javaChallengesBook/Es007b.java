package javaChallengesBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Es007b {

  static List<RomanNumber> romanList = new ArrayList<>();
  static String output = "";

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

  private static void basicRomanNumberListInitialization(){
    if(romanList.size()==0){
      romanList.add(new RomanNumber(1,0,'I'));
      romanList.add(new RomanNumber(5,0,'V'));
      romanList.add(new RomanNumber(1,1,'X'));
      romanList.add(new RomanNumber(5,1,'L'));
      romanList.add(new RomanNumber(1,2,'C'));
      romanList.add(new RomanNumber(5,2,'D'));
      romanList.add(new RomanNumber(1,3,'M'));
    }
  }
  private static void getRoman(int n, int power){
    basicRomanNumberListInitialization();
    for (RomanNumber rn:romanList){
      if (rn.getPotenzaDieci() == power && rn.getValoreAssoluto() == n){
        output = rn.getLetteraRomana()+output;
      }
    }
  }
  private static String returnRoman2(int numero){
    int control = numero;
    if (control>3999 || control<=0) {
      return "Inserisci un valore compreso tra 1 e 3999";
    }
    for (int i = 0; control > 0; i++) {
      int temp = control%10;
      switch (temp){
        case 1:{
          getRoman(1,i);
          break;
        }
        case 2:{
          for (int j = 0; j < 2; j++) {
            getRoman(1,i);
          }
          break;
        }
        case 3:{
          for (int j = 0; j < 3; j++) {
            getRoman(1,i);
          }
          break;
        }
        case 4:{
          getRoman(5,i);
          getRoman(1,i);
          break;
        }
        case 5:{
          getRoman(5,i);
          break;
        }
        case 6:{
          getRoman(1,i);
          getRoman(5,i);
          break;
        }
        case 7:{
          for (int j = 0; j < 2; j++) {
            getRoman(1,i);
          }
          getRoman(5,i);
          break;
        }
        case 8:{
          for (int j = 0; j < 3; j++) {
            getRoman(1,i);
          }
          getRoman(5,i);
          break;
        }
        case 9:{
          getRoman(1,i+1);
          getRoman(1,i);
          break;
        }
        default:
      }
      control = control/10;
    }
    return output;
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
    int test = 1356;
    System.out.println(returnRoman(test));
    System.out.println(returnRoman2(test));
  }
}