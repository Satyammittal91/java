import java.util.Scanner;

public class Bank {
  private String accountHolderName;
  private String accountNumber;
  private double balance;

  public Bank(String accountHolderName, String accountNumber, double initialBalance) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
    } else {
      System.out.println("Invalid amount or insufficient funds.");
    }
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  public void changeAccountHolderName(String newName) {
    if (newName != null) {
      accountHolderName = newName;
      System.out.println("Account holder name changed to " + newName);
    } else {
      System.out.println("Invalid name.");
    }
  }

  public void requestPassbook() {
    System.out.println("Passbook requested for account " + accountNumber);
  }

  public void displayAccountDetails() {
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: $" + balance);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter account holder name:");
    String name = scanner.nextLine();
    System.out.println("Enter account number:");
    String accountNumber = scanner.nextLine();
    System.out.println("Enter initial balance:");
    double balance = scanner.nextDouble();

    Bank bank = new Bank(name, accountNumber, balance);
    int choice = 8;
    while (choice == 8) {
      System.out.println("\n--- Menu ---");
      System.out.println("1. Withdraw");
      System.out.println("2. Deposit");
      System.out.println("3. Change Account Holder Name");
      System.out.println("4. Request Passbook");
      System.out.println("5. Display Account Details");
      System.out.println("6. Exit");
      System.out.print("Choose an option: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = scanner.nextDouble();
          bank.withdraw(withdrawAmount);
          break;
        case 2:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = scanner.nextDouble();
          bank.deposit(depositAmount);
          break;
        case 3:
          System.out.print("Enter new account holder name: ");
          String newName = scanner.nextLine();
          bank.changeAccountHolderName(newName);
          break;
        case 4:
          bank.requestPassbook();
          break;
        case 5:
          bank.displayAccountDetails();
          break;
        case 6:
          System.out.println("Have a good day! Thanks for visit");
          scanner.close();
          return;
        default:
          System.out.println("Invalid option. Please try again.");
      }
      System.out.println("If want to go to menu press 8");
      System.out.println("For exit press anything else 8");
      System.out.print("Choose an option: ");
      choice = scanner.nextInt();
      scanner.nextLine();
      if (choice != 8) {
        System.out.println("Have a good day! Thanks for visit");
        scanner.close();
        return;
      }
    }
  }
}
