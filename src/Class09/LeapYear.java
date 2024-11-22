package Class09;

public class LeapYear {

    public static void main(String[] args) {


        int year = 2024;

        //Logic
        if (year%4 == 0){
            System.out.println("It is a leap year");
        }else {
            System.out.println("It is not a leap year");

        }


    }


}



/*

6	Leap Year Checker

	Write a Java program to determine whether a given year is a leap year or not.

	Hint:

	1. Input: Take the year as input from the user.
	2. Logic: Use an if-else statement to check the leap year condition. A year is a leap year if it is divisible by 4
	3. Output: Print whether the year is a leap year or not.

	Example:

	If the input year is 2024, the output should be:
	2024 is a leap year



 */