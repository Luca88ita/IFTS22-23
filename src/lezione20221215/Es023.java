package lezione20221215;
// numeri perfetti
public class Es023 {
  public static boolean isPerfect(int n){
    int confronto =0;
    for (int divisore = 1; divisore <= n/2; divisore++) {
      if (n%divisore==0){
        confronto=confronto+divisore;
      }
    }
    if (confronto==n){
      System.out.println(n);
      return true;
    }else{
    return false;
    }
  }

  public static void main(String[] args) {
    int n = 10000;
    System.out.println("I numeri perfetti da 1 a "+n+" sono:");
    for (int i = 1; i <= n; i++) {
      if(i % 50000 == 0){
        System.out.println("sono arrivato a "+(i));
      }
      isPerfect(i);
    }
  }
}
