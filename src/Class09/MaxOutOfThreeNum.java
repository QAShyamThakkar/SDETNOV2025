package Class09;


import java.util.Scanner;

public class MaxOutOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Num1");
        int num1 = sc.nextInt();

        System.out.println("Please enter Num2");
        int num2 = sc.nextInt();

        System.out.println("Please enter Num3");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is the largest Number");

        }else if (num2>num3){
            System.out.println(num2 + " is the largest Number");

        }else {
            System.out.println(num3 + " is the largest Number");
        }


    }


}


/*

8	Write a Java program to find the largest number among three given numbers.

	Hint:

	1. Input: You can either hardcode the numbers or take them as input from the user using the Scanner class.
	2. Comparison: Use nested if-else statements to compare the numbers and determine the largest one.
	3. Output: Print the largest number.

	Example:

	If the input numbers are 199, 133, and 291, the output should be:

	C is greatest





 */