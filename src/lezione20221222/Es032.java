package lezione20221222;
//esercizi alla pagina https://github.com/nbicocchi/ooprogramming/blob/master/java-code/src/main/java/it/oop/collections/exercises/Sets.java

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Es032 {
  /**
   * Write a function returning the intersection of two given sets (without using library functions)
   */
  public static Set<Integer> intersectionManual(Set<Integer> first,Set<Integer> second){
    Set<Integer> intersection = new HashSet<>();
    for (int i: first){
      if (second.contains(i)){
        intersection.add(i);
      }
    }
    return intersection;
  }
  /**
   * Write a function returning the union of two given sets (without using library functions)
   */
  public static Set<Integer> unionManual(Set<Integer> first,Set<Integer> second){
    Set<Integer> union = new HashSet<>();
    for (int i: first){
      union.add(i);
    }
    for (int i: second){
      union.add(i);
    }
    return union;
  }
  /**
   * Write a function returning the intersection of two given sets (see retainAll())
   */
  public static Set<Integer> intersectionRetainAll(Set<Integer> first,Set<Integer> second){
    Set<Integer> intersection = new HashSet<>(first);
    intersection.retainAll(second);
    return intersection;
  }
  /**
   * Write a function returning the union of two given sets (see addAll())
   */
  public static Set<Integer> unionAddAll(Set<Integer> first,Set<Integer> second){
    Set<Integer> union = new HashSet<>(first);
    union.addAll(second);
    return union;
  }
  /**
   * Write a function to transform a set into a list without duplicates
   * Note well: collections can be created from another collection!
   */
  public static List<Integer> transformSetToList(Set<Integer> set){
    return new ArrayList<>(set);
  }
  /**
   * create list with duplicates starting with 2 Sets with duplicate numbers
   */
  public static List<Integer> duplicateList(Set<Integer> set1, Set<Integer> set2){
    List<Integer> list1 = new ArrayList<>(new HashSet<>(set1));
    List<Integer> list2 = new ArrayList<>(new HashSet<>(set2));
    list1.addAll(list2);
    return list1;
  }
  /**
   * Write a function to remove duplicates from a list
   * Note well: collections can be created from another collection!
   */
  public static List<Integer> removeDuplicatesFromList(List<Integer> input){
    return new ArrayList<>(new HashSet<>(input));
  }
  /**
   * Write a function to remove duplicates from a list without using the constructors trick seen above
   */
  public static List<Integer> removeDuplicatesFromList2(List<Integer> input){
    List<Integer> temp = new ArrayList<>(input);
    for(int i: input){
      if (temp.lastIndexOf(i) != temp.indexOf(i)) {
        temp.remove(temp.indexOf(i));
      }
    }
    return temp;
  }
    /**
   * Write a function to remove duplicates from a list without using the constructors trick seen above
   */
  public static List<Integer> removeDuplicates_manual(List<Integer> l) {
    Set<Integer> seen = new HashSet<>();
    List<Integer> tmp = new ArrayList<>();
    for (int i : l) {
        if (!seen.contains(i)) {
            seen.add(i);
            tmp.add(i);
        }
    }
    return tmp;
  }
   /**
     * Write a function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
  public static char getFirstRecurringChar(String str) {
    List<Character> l1 = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      l1.add(str.charAt(i));
    }
    for(char i: l1){
       if (l1.lastIndexOf(i) != l1.indexOf(i)) {
        return i;
      } 
    }
    return ((char) 0);
  }
   /**
     * Write a function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
  public static String firstRecurringCharacter(String s) {
    Set<Character> seenCharacters = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (seenCharacters.contains(c)) {
            return Character.toString(c);
        } else {
            seenCharacters.add(c);
        }
    }
    return null;
  }
   /**
     * Write a function accepting a string s, and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     */
    public static Set<Character> getAllRecurringChar(String str) {
      List<Character> l1 = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
        l1.add(str.charAt(i));
      }
      Set<Character> s1 = new HashSet<>();
      for(char i: l1){
         if (l1.lastIndexOf(i) != l1.indexOf(i)) {
          s1.add(i);
        } 
      }
      return s1;
    }
    /**
     * Write a function accepting a string s, and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     */
    public static Set<Character> allRecurringChars(String s) {
      Set<Character> seen = new HashSet<>();
      Set<Character> duplicates = new HashSet<>();
      for (char c : s.toCharArray()) {
          if (!seen.contains(c)) {
              seen.add(c);
          } else {
              duplicates.add(c);
          }
      }
      return duplicates;
  }
    /**
     * Write a function to transform a set into an array
     */
    public static Integer[] setIntoArray(Set<Integer> s1) {
      return s1.toArray(new Integer[]{});
    }
     /**
     * Write a function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int firstItemTreeSet(TreeSet<Integer> s1) {
      return s1.first();
    }
    /**
     * Write a function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int lastItemTreeSet(TreeSet<Integer> s1) {
      return s1.last();
    }
    /**
     * Write a function to get an element from a TreeSet which is strictly greater than a given element.
     * Note well: use TreeSet specific methods
     */
    public static int greaterItemTreeSet(TreeSet<Integer> s1, int test) {
      return s1.higher(test);
    }

  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>(Set.of(23, 45, 11, 22, 88));
    Set<Integer> s2 = new HashSet<>(Set.of(11, 22, 63, 78, 37));
    List<Integer> l1 = new ArrayList<>(List.of(23, 45, 11, 22, 88, 11, 22, 37, 63, 78, 22, 22, 22, 22, 22, 22));
    TreeSet<Integer> t1 = new TreeSet<>(Set.of(23, 45, 11, 22, 88));
    String st1 = "Cazzo";
    /*----------------------------------------------*/
    System.out.println(intersectionManual(s1,s2));
    System.out.println(unionManual(s1,s2));
    System.out.println(intersectionRetainAll(s1,s2));
    System.out.println(unionAddAll(s1,s2));
    System.out.println("-------------------------");
    /*----------------------------------------------*/
    System.out.println(transformSetToList(unionAddAll(s1,s2)));
    System.out.println(duplicateList(s1,s2));
    System.out.println(removeDuplicatesFromList(duplicateList(s1,s2)));
    System.out.println("-------------------------");
    /*----------------------------------------------*/
    System.out.println(removeDuplicatesFromList2(duplicateList(s1,s2)));
    System.out.println(removeDuplicatesFromList2(l1));
    if (getFirstRecurringChar(st1)!=((char)0)) {
      System.out.println("Il primo carattere che compare più di una volta in "+st1+" è '"+getFirstRecurringChar(st1)+"'");
    }else{
      System.out.println("Nessun carattere compare più di una volta");
    }
    if (getAllRecurringChar(st1).size()!=0) {
      System.out.println("I caratteri che compaiono più di una volta in "+st1+" sono: "+getAllRecurringChar(st1));
    }else{
      System.out.println("Nessun carattere compare più di una volta");
    }
    System.out.println("-------------------------");
    for (int i = 0; i < setIntoArray(s1).length; i++) {
      System.out.println(setIntoArray(s1)[i]);
    }
    System.out.println("-------------------------");
    System.out.println("Il primo elemento di questo treeset è "+firstItemTreeSet(t1)+", mentre l'ultimo è "+lastItemTreeSet(t1));
    System.out.println(greaterItemTreeSet(t1,20));
  }
}
