import java.util.*;
import java.text.*;

public class October7 {
  public static void main(String[] args) {
    Locale locale = Locale.of("en", "IN");
    System.out.println("Name of the coustomer : ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Name of the Product : ");
    String product = sc.nextLine();
    System.out.println("Quantity of Product : ");
    int quantity = sc.nextInt();
    System.out.println("Price of Product : ");
    double price = sc.nextDouble();
    System.out.println("Tax rate : ");
    double tax = sc.nextDouble();
    double bill = (quantity * price) + (quantity * price * tax / 100);
    Date date = new Date();
    DateFormat dtf = DateFormat.getDateInstance(DateFormat.LONG, locale);
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    System.out.println("--------------Bill-------------");
    System.out.println(dtf.format(date));
    System.out.print("Coustomer - ");
    int j = 0;
    for (int i = 0; i < name.length(); i++) {
      if (i == 0 || i == j) {
        if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
          System.out.print(Character.toUpperCase(name.charAt(i)));
        } else {
          System.out.print(name.charAt(i));
        }
      } else {
        if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
          System.out.print(Character.toLowerCase(name.charAt(i)));
        } else {
          System.out.print(name.charAt(i));
        }
      }
      if (name.charAt(i) == ' ') {
        j = i + 1;
      }
    }
    System.out.println();
    System.out.println("Product Name - " + product);
    System.out.println("Product Quantity - " + quantity);
    System.out.println("Amount without tax - " + (quantity * price));
    System.out.println("Tax rate - " + tax);
    System.out.println("Total amount have to pay : " + nf.format(bill));
    System.out.println("--------------Thankyou for purchasing-------------");
  }
}
