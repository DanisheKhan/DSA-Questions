public class A06_PrintCharacterPattern {
  public static void main(String args[]) {
    int n = 4;
    char ch = 'A';
    for (int lines = 1; lines <= n; lines++) {
      for (int character = 1; character <= lines; character++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}