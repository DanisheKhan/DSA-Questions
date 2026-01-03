public class A06_PrintHalfPyremidPattern {
  public static void main(String[] args) {
    int n=4; 
    for(int lines=1; lines<=n; lines++){
      for(int number=1; number<=lines; number++){
        System.out.print(number);
      }
      System.out.println();
    }
  }
}
