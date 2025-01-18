package Class32_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eg1_TypesOfRunTimeExceptions {
    public static void main(String[] args) {

        int a = 10, b = 0;
        int array[] = new int[5]; //{0, 1, 2, 3, 4}
        String s = null;

        Scanner sc = new Scanner(System.in);

        try {
            int c = sc.nextInt();
            System.out.println(c);
        } catch (InputMismatchException e) {
            System.out.println("Please use int only" + e.getMessage());
        }

        try {
            System.out.println(s.length());
            System.out.println(a / b);
            System.out.println(array[10]);

        } catch (ArithmeticException e) {
            System.out.println("Can Not be divided by Zero, go to Kenneths class and learn the maths");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stay in your limit " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Can Not get Lenght of Null String " + e.getMessage());
        }

        System.out.println("Thank you for using the application");


    }
}
