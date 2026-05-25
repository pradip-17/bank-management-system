import java.util.Scanner;

class bankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // method to create account
    void createBankAccount(int accno, String accholderName, double bal) {
        accountNumber = accno;
        accountHolderName = accholderName;
        balance = bal;
        System.out.println("Acoount created successfully.");
    }

    // mathod to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalied deposited amount.");
        }
    }

    // mathod to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkbalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Bank_Account_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a account number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("\nAccountholders name: ");
        String AccHolderName = sc.nextLine();

        System.out.print("\nEnter initial balance: ");
        double bal = sc.nextDouble();

        // create a object for class bankAccount
        bankAccount acc = new bankAccount();

        // call createbankAccount mathod for create account.
        acc.createBankAccount(accNo, AccHolderName, bal);

        int choise;
        do {
            System.out.println("\n ---- Bank Menu ---- ");
            System.out.println("1. Deposit");
            System.out.println("2. withdraw");
            System.out.println("3. check balance");
            System.out.println("4. Exit");

            System.out.print("Enter yout choise.");
            choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.print("Enter deposit amount.");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdraw amount.");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.checkbalance();
                    break;
                case 4:
                    System.out.println("Thank you for usnig our bank,");
                    break;

                default:
                    System.out.println("Invalied choise.");
                    break;
            }

        } while (choise != 4);
    }
}