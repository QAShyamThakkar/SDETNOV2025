package Class23_ClassAndObject;

public class BankClass {
    // 1. Variables

    int accountNumber;
    String accountName;
    double accountBalance;

    // 2. Methods

    void openAccount(String type){
        System.out.println("New account opened " +type);
    }

    void deposit(int amount){
        System.out.println("You deposited " + amount);
        accountBalance= accountNumber+amount;
    }

    void withdraw(int amount){
        System.out.println("You withdraw " + amount);
        accountBalance= accountBalance-amount;
    }

    void showBalance(){
        System.out.println("You account Balance is " + accountBalance);
    }




}
