import java.util.Scanner;

public class FactuseRec {
  static int FR(int n) {
    if (n <= 0) {
      return 1;
    }
    return n * FR(n - 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number for factorial");
    int n = sc.nextInt();
    System.out.println("Factorial of the " + n + " is = " + FR(n));
  }
}
