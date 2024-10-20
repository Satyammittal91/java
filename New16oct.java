import java.util.Scanner;

public class New16oct {
  static int Calcpower(int base, int exp) {
    if (exp == 0) {
      return 1;
    }
    if (exp == 1) {
      return base;
    }
    return Calcpower(base, exp - 1) * base;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base value ---- ");
    int base = sc.nextInt();
    System.out.println("Enter the exponent value -----");
    int exp = sc.nextInt();
    int i = Calcpower(base, exp);
    System.out.println("The value of " + base + "^" + exp + " = " + i);
    // return 0;
  }
}
