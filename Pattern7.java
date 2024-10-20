public class Pattern7 {
  static void printspace(int row) {
    if (row < 0) {
      return;
    }
    if (row == 0) {
      System.out.print("*");
    }
    System.out.print(" ");
    printspace(row - 1);
  }

  static void printstar(int n) {
    if (n == 0) {
      return;
    }
    if (n == 1) {
      System.out.print("*");
    }
    System.out.print("**");
    printstar(n - 1);
  }

  static void printpattern(int b, int cr, int n) {
    if (cr > n) {
      return;
    }
    printspace(n);
    System.out.println();

    if (cr == n && b == 0) {
      printstar(n);
      System.out.println();
      printspace(n);
      System.out.println();
      cr = 1;
      b = 1;
    }
    printpattern(b, cr + 1, n);

  }

  public static void main(String[] args) {
    printpattern(0, 1, 5);
  }
}
