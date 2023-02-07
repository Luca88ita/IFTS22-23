package javaChallengesBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Es002bis {
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
    List<String> convert = new ArrayList<>();
    int n = 123546;
    while (n > 0){
      convert.add(numberAsText(n));
      n = n/10;
    }
    Collections.reverse(convert);
    System.out.println(convert.toString());
  }
}
