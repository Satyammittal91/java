import java.util.Scanner;

public class Fib {
  static int Fibano(int n) {
    if (n == 1) {
      return 0;
    }
    if (n == 2) {
      return 1;
    }
    return Fibano(n - 2) + Fibano(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how much terms you want ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.print(Fibano(i) + " ");
    }
  }
}
