package Class06;

import java.util.Scanner;

public class ScannerClassCalculatorEG2 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Num1");
        int a = sc.nextInt();

        System.out.println("Please enter Num2");
        int b = sc.nextInt();

        System.out.println("Please enter operator");
        String operator = sc.next();  //600

//        int a = 10;
//        int b = 20;
//        char operator = '+';

        //Logic
        switch (operator){

            case "+": System.out.println(a+b); break;
            case "-": System.out.println(a-b); break;
            case "*": System.out.println(a*b); break;
            case "/": System.out.println(a/b); break;

            default:
                System.out.println("Please enter + - % and / only");

        }

        System.out.println("Thank you for using the app");

    }


}
