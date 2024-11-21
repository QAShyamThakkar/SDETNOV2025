package Class08;

public class GradeSystem {

//    Question- Can we use switch statement???


    public static void main(String[] args) {

        int number = 152;

        if (number <= 40) {
            System.out.println("Better Luck Next Time!");

        } else if (number <= 60) {
            System.out.println("B");
        } else if (number <= 80) {
            System.out.println("A");

        } else if (number <= 100) {
            System.out.println("A+");
        } else {
            System.out.println("Please enter from 0 to 100");

        }

    }

}


/*
1	Grade System:

	Write a Java program to implement a simple grade system.
	The program should take a student's percentage as input and print the corresponding grade based on the following criteria:

	0-40: Better Luck Next Time!
	41-60: B
	61-80: A
	81-100: A+

	Hint:
	Use an if-else if-else ladder to check the percentage and print the appropriate grade.
	You can use a Scanner class to take the percentage as input from the user.






 */