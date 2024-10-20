public class Pattern8 {
  static void Printspace(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(" ");
    Printspace(n - 1);
  }
  static void printstar(int n){
    System.out.print("*");
  }
  static void printpattern(int c, int n){
    if(c>n && c<0){return;}
    Printspace(c);
    printstar(n);
    Printspace(n+1-c);
    Printspace(n-c);
    printstar(n);
    System.out.println();
    if(c==n){
      return; 
      
    }
    printpattern(c+1, n,r+1,);
  }
  public static void main(String[] args) {
    printpattern(1, 10);
  }
}
