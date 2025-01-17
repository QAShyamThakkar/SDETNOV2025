package Class31_AccessModifier_Encapsualtion;

class Bank {
    int balance;

   Bank(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }
}

public class EncapsulationEg1 {
    public static void main(String[] args) {
        Bank kAc = new Bank(100);
        System.out.println(kAc.balance);

        kAc.balance = 10000000;



    }


}
