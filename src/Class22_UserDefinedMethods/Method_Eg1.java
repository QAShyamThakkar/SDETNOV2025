package Class22_UserDefinedMethods;

import java.util.Scanner;

public class Method_Eg1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Num1");
        printLine40(20); //29
        int num1 = sc.nextInt();

        System.out.println("Please enter Num2");
        printLine40(20); //40
        int num2 = sc.nextInt();

        System.out.println("Here is your result =");
        printLine20(); //20
        System.out.println(num1+num2);

        printLine20(); //20
    }

    public static void printLine40(int num) {
         System.out.println("----------------------------------------");
     }

    public static void printLine20() {
        System.out.println("------------------");
    }


}
