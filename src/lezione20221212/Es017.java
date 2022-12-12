package lezione20221212;

public class Es017 {
  public static void arraySequenziale(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i+1);
    }
  }
  public static void arrayDoppio(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i]*2;
    }
  }
  public static double arrayMedia(int[] arr){
    double media = 0;
    for (int i = 0; i < arr.length; i++) {
      media += arr[i];
    }
    return (media = media/arr.length);
  }
  public static int arrayMax(int[] arr){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max<arr[i]){
        max=arr[i];
      }
    }
    return max;
  }
  public static int arrayMin(int[] arr){
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (min>arr[i]){
        min=arr[i];
      }
    }
    return min;
  }
  public static boolean isSortedIncr(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i]>arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static int[] sortIncr(int[]arr){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i]>arr[j]){
          int tmp = arr[i];
          arr[i]=arr[j];
          arr[j]=tmp;
        }
      }
    }
    return arr;
  }
  public static int[] sortDecr(int[]arr){
    for (int i = arr.length; i > 0; i++) {
      for (int j = arr.length-1; j > i-1; j++) {
        if (arr[i]>arr[j]){
          int tmp = arr[i];
          arr[i]=arr[j];
          arr[j]=tmp;
        }
      }
    }
    return arr;
  }
  public static void arrayPrint (int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Il "+(i+1)+"° elemento dell'array è "+arr[i]);
    }
  }
  public static void main(String[] args) {
    int[] array = new int[10];
    arraySequenziale(array);
    arrayPrint(array);
    arrayDoppio(array);
    arrayPrint(array);
    System.out.printf("La media dei valori dell'array è %.2f \n", arrayMedia(array));
    System.out.println("Il numero maggiore dentro l'array è "+arrayMax(array));
    System.out.println("Il numero minore dentro l'array è "+arrayMin(array));
    System.out.println("Verifica se l'array è ordinato in maniera crescente: "+isSortedIncr(array));
    arrayPrint(sortIncr(array));
    arrayPrint(sortDecr(array));
  }
}
