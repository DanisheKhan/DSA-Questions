public class A03_PrintReverseNumber {
  public static void main(String[] args) {
    int n = 392003;
    // self
    // for (int i = 0; i < 6; i++) {
    // int lastdigit = n % 10;
    // System.out.print(lastdigit);
    // n = n / 10;
    // }

    // Optimal solution
    while (n > 0) {
      int ld = n % 10;
      System.out.print(ld);
      n /= 10;
    }

  }
}
