package Class24_Constructor;

public class BankClass {
    // 1. Variables

    int accountNumber;
    String accountName;
    double accountBalance;

    //2. Constructors - To initialize the variables

    BankClass(int accountNumberFromUser, String accountNameFromUSer, int initialDeposit){
        accountNumber= accountNumberFromUser;
        accountName=accountNameFromUSer;
        accountBalance=initialDeposit;
    }

    BankClass(){

    }

    //Default constructor created by JAVA
//    BankClass(){
//
//    }


    // 3. Methods

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
