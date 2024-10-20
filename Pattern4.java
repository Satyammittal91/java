public class Pattern4 {
  static void Print(int c, int n) {
    if (c > n) {
      return;
    }

    Printstar(n);
    System.out.println();
    Print(c, n - 1);
  }

  static void Printstar(int n) {
    if (n == 0) {
      return;
    }
    System.out.print("*");
    Printstar(n - 1);
  }

  public static void main(String[] args) {
    Print(1, 4);
  }
}
