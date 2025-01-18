package Class32_ExceptionHandling;

public class Eg4_throw {
    public static void main(String[] args) {

        try {
            votingEligibility(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void votingEligibility(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not eligible for voting");
        } else {
            System.out.println("Welcome to the voters list");
        }

        System.out.println("Please read voting process");
    }

}
