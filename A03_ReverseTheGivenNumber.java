public class A03_ReverseTheGivenNumber {
  public static void main(String[] args) {
    int n = 162005;
    while (n > 0) {
      int lastnumber = n % 10;
      int ReveseNumber = lastnumber;
      n /= 10;
      System.out.print(ReveseNumber);
    }
  }
}
