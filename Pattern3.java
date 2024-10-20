public class Pattern3 {
  static void Printstar(int n) {
    if (n == 0) {
      return;
    }
    System.out.print("*");
    Printstar(n - 1);
  }

  static void Printspace(int c, int n) {
    if (c > n) {
      return;
    }
    if (c == 1 || c == n) {
      System.out.print("*");
    } else {
      System.out.print(" ");
    }
    Printspace(c + 1, n);
  }

  static void Print(int c, int n) {
    if (c > n) {
      return;
    }
    if (c == 1 || c == n) {
      Printstar(n);
    } else {
      Printspace(1, n);
    }
    System.out.println();
    Print(c + 1, n);
  }

  public static void main(String[] args) {
    Print(1, 4);
  }
}
