package Class31_AccessModifier_Encapsualtion;

class Bank {
    private int balance;

    Bank(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void getBalance() {
        System.out.println(balance);
    }

    void setBalance(int balance) {

        this.balance = balance;
        System.out.println("Balance is updated today");
    }

}

public class EncapsulationEg1 {
    public static void main(String[] args) {
        Bank kAc = new Bank(100);
        kAc.getBalance();

        kAc.setBalance(10000000);
        kAc.getBalance();

    }


}
