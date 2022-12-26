package lezione20221215;

// numeri di Armstrong
public class Es024 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        for (int k = 0; k < 10; k++) {
          // System.out.println(i + " " + j + " " + k);
          int n = i * 100 + j * 10 + k;
          int sum = (int) (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3));
          if (n == sum) {
            System.out.println(n);
          }
        }
      }
    }
  }
}
