public class CalDigit {
  static void pr(int n) {
    if (n == 0)
      return;
    pr(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    pr(10);
  }
}
