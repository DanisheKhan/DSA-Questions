package D_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A05_SoringArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(14);
    list.add(23);
    list.add(34);
    list.add(421);
    list.add(15);
    System.out.println(list);

    // Soring the ArrayList asc
    Collections.sort(list);
    System.out.println(list);

    // Soring the ArrayList dsc
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
  }
}
