package Class24_Constructor;

import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {

        BankClass voldAcc = new BankClass(12345, "Vold",100);

        BankClass melissaAcc = new BankClass();


        System.out.println(voldAcc.accountBalance); //1M
        System.out.println(voldAcc.accountName);    //
        System.out.println(voldAcc.accountNumber);

        System.out.println(melissaAcc.accountName);
        System.out.println(melissaAcc.accountNumber);
        System.out.println(melissaAcc.accountBalance);





    }

}
