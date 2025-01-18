package Class32_ExceptionHandling;

public class Eg2_ExceptionParentClass {
    public static void main(String[] args) {

        int a = 10, b = 0;
        int array[] = new int[5]; //{0, 1, 2, 3, 4}
        String s = null;


        try {
            System.out.println(s.length());
            System.out.println(a / b);
            System.out.println(array[10]);

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println("Thank you for using the application");


    }
}
