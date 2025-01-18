package Class32_ExceptionHandling;

public class Eg5_throws {
    public static void main(String[] args) {

        try {
            withdraw(180);
        } catch (Exception e) {
            System.out.println("You dont have enough balance");
        }
    }

    public static void withdraw(int amount) throws Exception {
        if (amount < 100) {
            System.out.println("Enjoy the money");
        } else {
            throw new Exception("You dont have enough balance");
        }

        System.out.println("Please refill the account balance");
    }

}
