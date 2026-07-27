import java.util.Scanner;

public class atm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        int amount, choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Balance = " + balance);
                    break;

                case 2:

                    System.out.print("Enter Deposit Amount: ");
                    amount = scanner.nextInt();

                    balance = balance + amount;

                    System.out.println("Amount Deposited Successfully!");
                    break;

                case 3:

                    System.out.print("Enter Withdraw Amount: ");
                    amount = scanner.nextInt();

                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Amount Withdrawn Successfully!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        scanner.close();
    }
}