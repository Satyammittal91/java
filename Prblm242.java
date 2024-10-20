public class Prblm242 {
  public static void main(String[] args) {
    String a = "HEART";
    String b = "EARTH";
    int c = 0;
    if (a.length() == b.length()) {
      for (int i = 0; i < a.length(); i++) {
        for (int j = 0; j < b.length(); j++) {
          if (a.charAt(i) == b.charAt(j)) {
            a.charAt(i);
            b.charAt(j);
            c = c + 1;
          }
        }
      }
    } else {
      System.out.println("NOT");
    }
    if (c == a.length()) {
      System.out.println("EQUAL");
    } else {
      System.out.println("NOT");
    }
  }
}