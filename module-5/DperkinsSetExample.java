/**
 * Donnell Perkins
 *
 * Module 5 discussion board - Examples of how Sets are used
 * https://www.simplilearn.com/tutorials/java-tutorial/set-in-java#:~:text=Set%20in%20Java%20is%20an,to%20create%20a%20mathematical%20set.
 */

 import java.util.*;

 public class DperkinsSetExample {
   public static void main(String[] args) {
     Integer[] r = {2, 3, 4, 22, 65, 12};
     Integer[] s = {12, 4, 54, 27, 0, 1};
     Set<Integer> set1 = new HashSet<Integer>();
     set1.addAll(Arrays.asList(r));
     Set<Integer> set2 = new HashSet<Integer>();
     set2.addAll(Arrays.asList(s));
     // Union
     Set<Integer> unionSet = new HashSet<Integer>(set1);
     unionSet.addAll(set2);
     System.out.print("Union is:");
     System.out.println(unionSet);
     // Intersection
     Set<Integer> intersectionSet = new HashSet<Integer>(set1);
     intersectionSet.retainAll(set2);
     System.out.print("Intersection is:");
     System.out.println(intersectionSet);
     // Difference
     Set<Integer> differenceSet = new HashSet<Integer>(set1);
     differenceSet.removeAll(set2);
     System.out.print("Difference of set1 from set2 is:");
     System.out.println(differenceSet);
   }
 }
