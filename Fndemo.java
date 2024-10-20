public class Fndemo {
  // this function is with void without parameter
  static void Demo1() {
    System.out.println("This is fn 1");
  }

  // this function is void with parameter
  static void Demo2(int a) {
    System.out.println("This is fn 2");
  }

  // non void with parameter
  static int Demo3(int b) {
    System.out.println("This is fn 3");
    return 0;
  }

  // non void without parameter
  static int Demo4() {
    System.out.println("This is fn 4");
    return 0;
  }

  public static void main(String[] args) {
    // Fndemo fd = new Fndemo();
    // fd.Demo1(); if the function are non static
    Demo1();
    Demo2(10);
    Demo3(5);
    Demo4();
    }
    //return 0;
  }

// function are store in stack, only function which are called in program are
// store in call stack