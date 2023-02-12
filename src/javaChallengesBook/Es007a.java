package javaChallengesBook;
/*
 * Write method int fromRomanNumber(String) that computes the corresponding decimal
 * number from a textually valid Roman number.
 */

import java.util.ArrayList;
import java.util.List;

public class Es007a {

  static List<RomanNumber> romanList = new ArrayList<>();

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

  public static boolean validityCheck(String s){
    char c1, c2;
    RomanNumber rnempty = new RomanNumber(0,0,' ');
    RomanNumber rn1 = rnempty;
    RomanNumber rn2 = rnempty;
    int counterPrevious1 = 0; // serve per verificare di non avere più di un valore di potenza inferiore precedente
    int counterNext3 = 0; // serve per verificare di non avere più di 3 valori 1 con la stessa potenza di fila
    int counterFives = 0; // serve per verificare di non avere 2 valori 5 con la stessa potenza di fila
    int counterPower = 0; // serve per verificare la potenza di un elemento rn1 pow(x) che abbia un solo elemento superiore di tipo
    int lastPowerindex = 3; // inizializzato a 3 evita falsi negativi (es MMCCCXXIII che è valido, segnato come falso)
    boolean check = false;
    /* qui controllo i numeri romani composti da una sola lettera */
    if (s.length()==1){
      c1 = s.charAt(0);
      for (RomanNumber rn:romanList){
        if (rn.getLetteraRomana() == c1) rn1 = rn;
      }
      return rn1.getLetteraRomana() != ' '? true: false;
    }
    /* qui sotto controllo i numeri romani composti da più lettere */
    /* comincio inizializzando i valori dei 2 elementi che andrò a confrontare */
    for (int i = 1; i < s.length(); i++) {
      check = false; // serve per evitare true in caso di lettere non romane in mezzo (es LXIF)
      c1 = s.charAt(i-1);
      c2 = s.charAt(i);
      rn1 = rnempty; // prevengo che mi rimangano valori residui
      rn2 = rnempty; // prevengo che mi rimangano valori residui
      for (RomanNumber rn:romanList){
        if (rn.getLetteraRomana() == c1) rn1 = rn;
        if (rn.getLetteraRomana() == c2) rn2 = rn;
      }
      /* controllo che entrambi i valori siano validi */
      if (rn1.getLetteraRomana() != ' ' && rn2.getLetteraRomana() != ' '){
        /* prevengo che possa darmi validi valori tipo IXC = 89 */
        if (rn1.getPotenzaDieci()<rn2.getPotenzaDieci() && rn2.getPotenzaDieci()>lastPowerindex) return false;
        /* qui controllo se la potenza del valore più a sinistra è maggiore a quella successiva:
        *  al contempo azzero alcune variabili contatore */
        if (rn1.getPotenzaDieci()>rn2.getPotenzaDieci()){
          counterPrevious1 = 0;
          counterNext3 = 0;
          counterFives = 0;
          check = true;
          /* prevengo che possa darmi validi valori tipo XCIXIII = 102 */
          if (counterPower > 0 && rn2.getPotenzaDieci()>=lastPowerindex) return false;
        }
        /* qui controllo se la potenza del valore più a sinistra è uguale a quella successiva:
        *  inizializzo la variabile check a true per avere la possibilità di avere più numeri
        *  con la stessa potenza uno di seguito all'altro */
        if (rn1.getPotenzaDieci()==rn2.getPotenzaDieci()){
          /* prevengo che possa darmi validi valori tipo IXXXVI = 35 */
          if (rn2.getPotenzaDieci()>lastPowerindex) return false;
          check = true;
          /* prevengo che possa darmi validi valori tipo VV = 10 */
          if(rn1.getValoreAssoluto() == 5 && rn2.getValoreAssoluto() == 5) return false;
          if(rn1.getValoreAssoluto() == 1 && rn2.getValoreAssoluto() == 5) {
            counterPrevious1++;
            counterFives++;
            /* prevengo che possa darmi validi valori tipo VIV = 9 */
            if (counterFives>1 || counterPrevious1>1) return false;
          }
          /* conto quanti 5 della stessa potenza ci sono nel numero */
          if (rn1.getValoreAssoluto() == 5 && rn2.getValoreAssoluto() == 1) counterFives++;

          /* conto quanti 1 della stessa potenza ci sono nel numero per prevenire IIV = 5 o IIII = 4 */
          if (rn1.getValoreAssoluto() == 1 && rn2.getValoreAssoluto() == 1){
            counterPrevious1++;
            counterNext3++;
            if(counterNext3>2) return false;
          }
        }
        /* qui controllo che il primo numero non abbia una differenza di potenza superiore a 1
        * rispetto al secondo (per non avere risultati true in casi tipo IC = 99) */
        if (rn1.getPotenzaDieci()+1 < rn2.getPotenzaDieci()) return false;
        else {
          /* se trovo un rn1 = 5 alla potenza 0+x ed rn2 alla potenza 1+x, devo restituire falso
          *  (per non avere risultati true in casi tipo LC = 50)*/
          if (rn1.getValoreAssoluto() == 5 && rn1.getPotenzaDieci() < rn2.getPotenzaDieci()) return false;
          else{
            lastPowerindex = rn1.getPotenzaDieci();
            counterPower++;
            check = true;
          }
        }
      }
    }
    return check;
  }

  public static boolean validityCheck2(String s){
    int test = returnArab(s);
    if (s.equals(Es007b.returnRoman(test))) return true;
    return false;
  }

  public static int returnArab(String s){
    int sum = 0;
    char c, c2;
    for (RomanNumber rn:romanList){
      c = s.charAt(s.length()-1);
      if (c == rn.getLetteraRomana()) sum = (int) (rn.getValoreAssoluto()*(Math.pow(10,rn.getPotenzaDieci())));
    }
    for (int i = 1; i < s.length(); i++) {
      c = s.charAt(s.length()-i-1);
      c2 = s.charAt(s.length()-i);
      int tmp1=0;
      int tmp2=0;
      for (RomanNumber rn:romanList){
        if (c == rn.getLetteraRomana()) tmp1 = (int) (rn.getValoreAssoluto()*(Math.pow(10,rn.getPotenzaDieci())));
        if (c2 == rn.getLetteraRomana()) tmp2 = (int) (rn.getValoreAssoluto()*(Math.pow(10,rn.getPotenzaDieci())));
      }
      sum = (tmp1 < tmp2) ? sum - tmp1: sum + tmp1;
    }
    return sum;
  }

  public static int fromRomanNumber(String s) {
    int sum = romanToArab(s.charAt(s.length()-1));
    char c, c2;
    for (int i = 1; i < s.length(); i++) {
      c = s.charAt(s.length()-i-1);
      c2 = s.charAt(s.length()-i);
      int tmp1 = romanToArab(c);
      int tmp2 = romanToArab(c2);
      sum = (tmp1 < tmp2) ? sum - tmp1: sum + tmp1;
    }
    return sum;
  }
  public static int romanToArab(char c) {
    if (c == 'I') {
      return 1;
    }
    if (c == 'V') {
      return 5;
    }
    if (c == 'X') {
      return 10;
    }
    if (c == 'L') {
      return 50;
    }
    if (c == 'C') {
      return 100;
    }
    if (c == 'D') {
      return 500;
    }
    if (c == 'M') {
      return 1000;
    }
    return 0;
  }
  public static void main(String[] args) {
    basicRomanNumberListInitialization();
    List<String> test = new ArrayList<>();
    test.add("I"); //should be printed*
    test.add("II"); //should be printed*
    test.add("III"); //should be printed*
    test.add("IV"); //should be printed*
    test.add("V"); //should be printed*
    test.add("VI"); //should be printed*
    test.add("VII"); //should be printed*
    test.add("VIII"); //should be printed*
    test.add("IX"); //should be printed*
    test.add("X"); //should be printed*
    test.add("XI"); //should be printed*
    test.add("XV"); //should be printed*
    test.add("L"); //should be printed*
    test.add("LV"); //should be printed*
    test.add("XCIX"); //should be printed*
    test.add("CI"); //should be printed*
    test.add("CCII"); //should be printed*
    test.add("CDXCIV"); //should be printed*
    test.add("DLV"); //should be printed*
    test.add("CMXCIX"); //should be printed*
    test.add("MCXI"); //should be printed*
    test.add("MCMLXXXIV"); //should be printed*
    test.add("MMCCCXXIII"); //should be printed*
    test.add("MMCDXXIV"); //should be printed*
    test.add("MMDXXV"); //should be printed*
    /* from here we shouldn't get any result printed, because they're wrong */
    test.add("MMMM");
    test.add("IXC");
    test.add("IIV");
    test.add("IIIV");
    test.add("IXV");
    test.add("IXVI");
    test.add("IXXVI");
    test.add("IXXXVI");
    test.add("IXXXVIX");
    test.add("VX");
    test.add("VXV");
    test.add("XCIXIII");
    test.add("XCIXV");
    test.add("XCIXVV");
    test.add("VL");
    test.add("VD");
    test.add("LL");
    test.add("F");
    test.add("LF");
    test.add("LXIF");
    test.add("LFX");
    test.add("FL");
    test.add("IC");
    test.add("IIICLLL");
    test.add("XXXX");
    test.add("F");
    test.add("LLL");
    test.add("VIV");
    int i = 0;
    for (String romanNumber:test){
      i++;
      if(validityCheck2(romanNumber)){
        //System.out.println(i+"° - "+romanNumber+" = "+fromRomanNumber(romanNumber));
        System.out.println(i+"° - "+romanNumber+" = "+returnArab(romanNumber));
      }
    }
  } 
}