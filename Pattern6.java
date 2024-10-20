public class Pattern6 {
  static void Print(int c, int b, int n) {
    if (c > n) {
      return;
    }

    Printspace(n);
    Printstar(b);
    System.out.println();
    Print(c, b, n - 1);
  }

  static void Printstar(int n) {
    if (n == 0) {
      return;
    }
    System.out.print("*");
    Printstar(n - 1);
  }

  static void Printspace(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(" ");
    Printspace(n - 1);
  }

  public static void main(String[] args) {
    Print(1, 4, 4);
  }
}
