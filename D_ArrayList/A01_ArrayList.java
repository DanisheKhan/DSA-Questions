package D_ArrayList;

import java.util.ArrayList;

public class A01_ArrayList {
  public static void main(String[] args) {
    // ArrayList are dynamic in size, it is primitive data types can't be stored
    // direclty

    // ArrayList Decleration
    ArrayList<Integer> list = new ArrayList<>();

    // Add operations
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);

    // Another add Operatoin
    list.add(0, 100);

    // Print ArrayList no need for the loop
    // System.out.println(list);

    // Get Operation
    // System.out.println(list.get(0));

    // Remove Operatin
    // list.remove(2);
    // System.out.println(list);

    // Set new value the indx
    // list.set(2, 12);
    // System.out.println(list);

    // Contains elements
    // System.out.println(list.contains(12));
    // System.out.println(list.contains(122));

    //size operation
    // System.out.println(list.size());

    // Iteration on arraylist
    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }

  }
}
