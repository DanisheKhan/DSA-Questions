public class A05_PrintInvertedStarPattern {
  public static void main(String[] args) {
    int n = 4;
    for (int lines = 0; lines < n; lines++) {
      for (int star = lines; star < n; star++) {
        System.out.print("*");
      }
      System.err.println();
    }
  }
}
