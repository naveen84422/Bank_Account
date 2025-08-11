import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        recordTransaction("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit: " + amount + " | Balance: " + balance);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recordTransaction("Withdraw: " + amount + " | Balance: " + balance);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String record : transactions) {
            System.out.println(record);
        }
    }

    private void recordTransaction(String detail) {
        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        transactions.add(time + " - " + detail);
    }
}

public class Account_Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(accNo, name, balance);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = sc.nextDouble();
                    acc.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withAmount = sc.nextDouble();
                    acc.withdraw(withAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;
                case 4:
                    acc.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the bank app!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
