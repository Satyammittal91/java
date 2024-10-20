public class Test2 {
  public static void main(String[] args) {
    // int a = 5;
    // int b = 6;

    // a=a+b;
    // b=a-b;
    // a=a-b;
    // System.out.println((a+" "+b));

    // a = a * b;
    // b = a / b;
    // a = a / b;
    // System.out.println((a + " " + b));

    // a = a ^ b;
    // b = a ^ b;
    // a = a ^ b;
    // System.out.println((a + " " + b));

    double ans = switch (args[2]) {
      case "+" -> Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
      case "-" -> Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
      case "x" -> Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
      case "/" -> Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
      default -> 0;
    };
    System.out.println(ans);

  }
}