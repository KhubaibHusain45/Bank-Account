package QuestionsPractice.Questions.Question78;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;


    BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public String deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial Balance: " + balance);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        return "Balance is now: " + balance;
    }

    public String withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initial Balance: " + balance);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("You haven't enough money to withdraw");
        } else {

            balance = balance - amount;
        }
        return "Balance is now: " + balance;
    }

    public String getBalance() {
        return "Balance is : " + balance;
    }
}
