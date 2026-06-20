import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int balance = 1000;
        int PIN = 6267;
        int choice = 0;
        int amount;
        int entered_pin;
        int new_pin;
        int target_account;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- WELCOME TO ATM -----");

        while (choice != 7) {

            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Transfer Money");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");
            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter Amount : ");
                amount = scanner.nextInt();

                if (amount > 0) {
                    balance = balance + amount;

                    System.out.println("\n----- RECEIPT -----");
                    System.out.println("Deposit Successful!");
                    System.out.println("Deposited Amount : " + amount + " RS");
                    System.out.println("Current Balance  : " + balance + " RS");
                } else {
                    System.out.println("Invalid Amount!");
                }

            } else if (choice == 2) {

                System.out.print("Enter PIN : ");
                entered_pin = scanner.nextInt();

                if (entered_pin == PIN) {

                    System.out.print("Enter Amount : ");
                    amount = scanner.nextInt();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount!");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance = balance - amount;

                        System.out.println("\n----- RECEIPT -----");
                        System.out.println("Withdraw Successful!");
                        System.out.println("Withdrawn Amount : " + amount + " RS");
                        System.out.println("Current Balance  : " + balance + " RS");
                    }

                } else {
                    System.out.println("Wrong PIN!");
                }

            } else if (choice == 3) {

                System.out.print("Enter PIN : ");
                entered_pin = scanner.nextInt();

                if (entered_pin == PIN) {
                    System.out.println("Current Balance : " + balance + " RS");
                } else {
                    System.out.println("Wrong PIN!");
                }

            } else if (choice == 4) {

                System.out.print("Enter Current PIN : ");
                entered_pin = scanner.nextInt();

                if (entered_pin == PIN) {

                    System.out.print("Enter New PIN : ");
                    new_pin = scanner.nextInt();

                    PIN = new_pin;

                    System.out.println("PIN Changed Successfully!");

                } else {
                    System.out.println("Wrong PIN!");
                }

            } else if (choice == 5) {

                System.out.print("Enter PIN : ");
                entered_pin = scanner.nextInt();

                if (entered_pin == PIN) {

                    System.out.print("Enter Target Account Number : ");
                    target_account = scanner.nextInt();

                    System.out.print("Enter Amount : ");
                    amount = scanner.nextInt();

                    if (amount <= 0) {
                        System.out.println("Invalid Amount!");
                    } else if (amount > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {

                        balance = balance - amount;

                        System.out.println("\n----- RECEIPT -----");
                        System.out.println("Transfer Successful!");
                        System.out.println("Target Account : " + target_account);
                        System.out.println("Transferred Amount : " + amount + " RS");
                        System.out.println("Current Balance : " + balance + " RS");
                    }

                } else {
                    System.out.println("Wrong PIN!");
                }

            } else if (choice == 7) {

                System.out.println("Thank You For Using ATM.");

            } else {

                System.out.println("Invalid Choice!");

            }
        }

        scanner.close();
    }
}
