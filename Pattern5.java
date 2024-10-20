public class Pattern5 {
  static void Print(int c, int n) {
    if (c > n) {
      return;
    }

    Printspace(c);
    Printstar(n);
    System.out.println();
    Print(c + 1, n);
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
    Print(1, 4);
  }
}
