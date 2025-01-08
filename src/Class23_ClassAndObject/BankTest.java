package Class23_ClassAndObject;

public class BankTest {

    public static void main(String[] args) {

        BankClass voldAcc = new BankClass();

        voldAcc.openAccount("Saving");
        voldAcc.showBalance();


        voldAcc.deposit(1000000);
        voldAcc.showBalance();


        voldAcc.withdraw(100);
        voldAcc.showBalance();

        System.out.println(voldAcc.accountName);
        System.out.println(voldAcc.accountNumber);


        BankClass kennethAcc = new BankClass();
        kennethAcc.showBalance();
    }

}
