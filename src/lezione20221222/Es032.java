package lezione20221222;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    List<Integer> temp = new ArrayList<>();

    //fjgjjhcjhcgjgck
    return temp;
  }



  public static void main(String[] args) {
    Set<Integer> s1 = new HashSet<>(Set.of(23, 45, 11, 22, 88));
    Set<Integer> s2 = new HashSet<>(Set.of(11, 22, 63, 78, 37));
    System.out.println(intersectionManual(s1,s2));
    System.out.println(unionManual(s1,s2));
    System.out.println(intersectionRetainAll(s1,s2));
    System.out.println(unionAddAll(s1,s2));
    System.out.println(transformSetToList(unionAddAll(s1,s2)));
    System.out.println(duplicateList(s1,s2));
    System.out.println(removeDuplicatesFromList(duplicateList(s1,s2)));
    System.out.println("-------------------------");
    System.out.println(removeDuplicatesFromList2(duplicateList(s1,s2)));
  }
}
