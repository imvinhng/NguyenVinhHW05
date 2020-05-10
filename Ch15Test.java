
/*
 * ==========================================
 * CS211, Spring 2020, 5/10
 * Vinh T. Nguyen
 * Homework 04 - Chap 15 , 1, 2, 5, 8, 11
 * Exercise 1 - LastIndexOf returns the last Index of the element
 * Exercise 2- indexOfSubList returns the first occurence of startin value of the list3 in list2
 * Exercise 5 - runningTotal method makes a new ArrayIntList with value at i
 * equals the sum of eletns 0 through i of the original list
 * Exercise 8 - count returns the number of times the element occurs in the list
 * Exercise 11 - removeLast() literally remove and return the last value of the list
 * ==========================================
 */
import java.util.*; 

public class Ch15Test {
   public static void main(String[] args) {
      ArrayIntList list = new ArrayIntList(); //for ex1
      ArrayIntList list2 = new ArrayIntList();  //for ex2
      ArrayIntList list3 = new ArrayIntList();  //
      ArrayIntList list4 = new ArrayIntList(8); //for ex5
      
      //inputting elements into the ArrayIntList
      List<Integer> a = Arrays.asList(1,18,2,7,18,39,18,40);
      list.addList(a);
      
      List<Integer> b = Arrays.asList(11,-7,3,42,0,14);
      list2.addList(b);
      
      List<Integer> c = Arrays.asList(3,42,0);
      list3.addList(c);
      
      List<Integer> d = Arrays.asList(2,3,5,4,7,15,20,7);
      list4.addList(d);
      
         
      //Exercise 1 - LastIndexOf returns the last Index of the element
      System.out.println(list);
      System.out.println("Last Index of 3: "+list.lastIndexOf(3)+"\n");
      
      //Exercise 2- indexOfSubList returns the first occurence of startin value of the list3 in list2
      System.out.println("Index of Sublist: "+list2.indexOfSubList(list3)+"\n");  //output: 2
      
      //Exercise 5 - runningTotal method makes a new ArrayIntList with value at i
      // equals the sum of eletns 0 through i of the original list
        System.out.println(list4);
        ArrayIntList list5 = list4.runningTotal();
        System.out.println(list5+"\n");
      
      //Exercise 8 - count returns the number of times the element occurs in the list
      System.out.println("The number 7 occured in list4 "+list4.count(7)+" times \n"); //output 2
      
   
    //Exercise 11 - removeLast() literally remove and return the last value of the list
      System.out.println(list4); 
      System.out.println("Last value: " + list4.removeLast());  //return 7
      System.out.println(list4); 
      System.out.println("Last value: "+ list4.removeLast());  //return 20
      System.out.println(list4); 
 }
}