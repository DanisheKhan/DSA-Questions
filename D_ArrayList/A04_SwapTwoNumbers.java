package D_ArrayList;

import java.util.ArrayList;

public class A04_SwapTwoNumbers {
  public static void SwapTwoNumbers(ArrayList<Integer> list, int a, int b) {
    int temp =list.get(a);
    list.set(a, list.get(b));
    list.set(b, temp);
    
    
    System.out.println(list);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(23);
    list.add(34);
    list.add(421);
    list.add(15);

    System.out.println(list);
    SwapTwoNumbers(list, 4, 1);
    
  }
}
