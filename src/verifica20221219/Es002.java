package verifica20221219;

public class Es002 {

  public static void orderBackwards(int[] arr){
    int temp1 = 0;
    //int cicli = arr.length/2;
    for (int i = 0; i < arr.length/2; i++) {
      temp1 = arr[arr.length-i-1];
      arr[arr.length-i-1]=arr[i];
      arr[i]= temp1;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,4,6,7};
    orderBackwards(arr);
  }
}
