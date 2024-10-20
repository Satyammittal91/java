public class Pattern {
  static void PrintPattern(int c, int n) {
    if (c > n) {
      return;
    }
    Printstar(n);
    System.out.println();
    PrintPattern(c + 1, n);
  }

  static void Printstar(int n) {
    if (n == 0) {
      return;
    }
    System.out.print("*");
    Printstar(n - 1);
  }

  public static void main(String[] args) {
    PrintPattern(1, 4);
  }
}
