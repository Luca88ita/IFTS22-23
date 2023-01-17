package javaChallengesBook;
/*
 * Write method String numberAsText(int) which, for a given positive number, converts
 * the respective digits into corresponding text.
 */

public class Es002 {
  static String numberAsText(final int n) {
    final int remainder = n % 10;
    String valueAsText = "";
    if (remainder == 0)
      valueAsText = "ZERO";
    if (remainder == 1)
      valueAsText = "UNO";
    if (remainder == 2)
      valueAsText = "DUE";
    if (remainder == 3)
      valueAsText = "TRE";
    if (remainder == 4)
      valueAsText = "QUATTRO";
    if (remainder == 5)
      valueAsText = "CINQUE";
    if (remainder == 6)
      valueAsText = "SEI";
    if (remainder == 7)
      valueAsText = "SETTE";
    if (remainder == 8)
      valueAsText = "OTTO";
    if (remainder == 9)
      valueAsText = "NOVE";
    return valueAsText;
  }

  public static void main(String[] args) {
    int n = 10684915;
    int temp  = n;
    int counter = 0; 
    while (temp>0){
      temp = temp/10;
      counter++;
    }
    String [] num = new String [counter];
    /*for (int i = 0; i < num.length; i++) {
      num[num.length-i-1] = numberAsText(n);
      n=n/10;
    }*/
    for (int i = 0; n>0; i++) {
      num[num.length-i-1] = numberAsText(n);
      n=n/10;
    }

    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}
