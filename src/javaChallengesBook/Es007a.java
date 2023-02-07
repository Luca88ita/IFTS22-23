package javaChallengesBook;
/*
 * Write method int fromRomanNumber(String) that computes the corresponding decimal
 * number from a textually valid Roman number.
 */

public class Es007a {
  public static int fromRomanNumber(String s) {
    int sum = romanToArab(s.charAt(s.length()-1));
    char c, c2;
    for (int i = 1; i < s.length(); i++) {
      c = s.charAt(s.length()-i-1);
      c2 = s.charAt(s.length()-i);
      int tmp1 = romanToArab(c);
      int tmp2 = romanToArab(c2);
      if (tmp1 < tmp2) {
        sum = sum - tmp1;
      }else{
        sum = sum + tmp1;
      }
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
    String romanNumber = "CIAO";
    System.out.println(fromRomanNumber(romanNumber));
  } 
}