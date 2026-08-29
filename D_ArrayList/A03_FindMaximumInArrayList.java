package D_ArrayList;

import java.util.ArrayList;

public class A03_FindMaximumInArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(6);
    list.add(2);
    list.add(3);
    list.add(4);

    int max = 0;
    for (int i = list.size() - 1; i >= 0; i--) {
      if (max < list.get(i)) {
        max = list.get(i);
      }
    }
    System.out.println(max);
  }
}
