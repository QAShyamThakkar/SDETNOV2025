package Class30_Polymorphism;

class Bank {
    void displayRateOfInt() {
        System.out.println("6%");
    }
}

class CityBank extends Bank {
    @Override
    void displayRateOfInt() {
        System.out.println("7%");
    }
}

class Chase extends Bank {

}

public class MethodOverridingEg2 {
    public static void main(String[] args) {
        Bank b = new Bank();
        CityBank cb = new CityBank();
         Chase ch = new Chase();

        b.displayRateOfInt();  //6%
        cb.displayRateOfInt();  //7%
        ch.displayRateOfInt();   //6%




    }

}
