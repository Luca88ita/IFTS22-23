package verifica20221219;

import java.sql.Array;

public class Es003 {
  public static String[] newCombinedArray(String[] arr1, String[] arr2){
    int arr3Length = arr1.length+ arr2.length;
    String[] arr3 = new String[arr3Length];
    int i=0, j=0, k=0;
    while (i < arr1.length && j<arr2.length){
      arr3[k++]=arr1[i++];
      arr3[k++]=arr2[j++];
    }
    while (i< arr1.length){
      arr3[k++]=arr1[i++];
    }
    while (j< arr2.length){
      arr3[k++]=arr2[j++];
    }
    return arr3;
  }
  public static String[] newCombinedArray2(String[] arr1, String[] arr2){
    int arr3Length = arr1.length;
    if (arr1.length < arr2.length){
      arr3Length = arr2.length;
    }
    String[] arr3 = new String[arr3Length];
    int k=0;
    while (k < arr1.length && k<arr2.length){
      if ((k+1)%2!=0){
        arr3[k]=arr1[k];
      }else{
        arr3[k]=arr2[k];
      }
      k++;
    }
    while (k< arr1.length){
      arr3[k]=arr1[k];
      k++;
    }
    while (k< arr2.length){
      arr3[k]=arr2[k];
      k++;
    }
    return arr3;
  }
  public static void printArray (String[]arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) {
    String[] arr1= {"1","2","3","4","5","6"};
    String[] arr2= {"a","b","c","d","e","f","g","h","i","j"};
    //printArray(newCombinedArray(arr1,arr2));
    printArray(newCombinedArray2(arr1,arr2));
  }
}
