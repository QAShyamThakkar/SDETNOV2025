package Class08;

public class DaysInaMonthwithSwitch {
    public static void main(String[] args) {

        int month = 3;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days"); break;
            case 2:
                System.out.println("28/29 days"); break;
            case 4, 6, 9, 11:
                System.out.println("30 days"); break;

            default:
                System.out.println("Please enter 1 to 12");
        }


    }

}








/*

3	Days in a Month

	Write a Java program to determine the number of days in a given month.

	Hint:

	1. Input: Take the month number as input from the user using the Scanner class.
	2. Calculation: Use an if-else if-else ladder or Switch (use both for practice) to check the month number and print the corresponding number of days.
	3. Output: Print the number of days in the given month.

	Example:

	If the input month is 2, the output should be:
	28/29 days

 */