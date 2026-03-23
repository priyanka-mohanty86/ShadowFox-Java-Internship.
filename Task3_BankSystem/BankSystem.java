import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    double balance = 0;
    ArrayList<String> history = new ArrayList<>();

    void deposit(double amount) {
        balance = balance + amount;
        history.add("Deposited: " + amount);
        System.out.println("Money deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance.");
        } else {
            balance = balance - amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Money withdrawn successfully.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void showHistory() {
        System.out.println("Transaction History:");
        for (String h : history) {
            System.out.println(h);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {

            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Program ended.");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    account.showHistory();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}