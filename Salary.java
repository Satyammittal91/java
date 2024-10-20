public class Salary {
  String name;
  int empid;
  String dept;
  int bs;
  double ta = 0.20, da = 0.30, pf = 0.12, hra = 0.25;
  double tax, gross;

  Salary(String name, int empid, String dept, int bs) {
    this.name = name;
    this.empid = empid;
    this.dept = dept;
    this.bs = bs;
  }

  void showsalary() {
    System.out.println("SPL.pvt.ltd");
    System.out.println(name + "/n" + empid + "/n" + dept + "/n" + bs);
    calculate();
  }

  void calculate() {
    double gross = bs + (bs * ta) + (bs * da) + (bs * hra);
  }
}
