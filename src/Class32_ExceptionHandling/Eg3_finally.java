package Class32_ExceptionHandling;

public class Eg3_finally {
    public static void main(String[] args) {

        int a = 10, b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println(a / b);
        }finally {
            System.out.println("Thank you for using the application");
        }

    }
}
