package Class08;

public class DiscountCalc {

    public static void main(String[] args) {

        int cartValue = 600;

        if (cartValue < 100) {
            System.out.println("5% discount, Final Value to pay " + (cartValue-cartValue*5/100)+ " Thank you!!");
        } else if (cartValue < 200) {
            System.out.println("10% discount, Final Value to pay " + (cartValue-cartValue*10/100));
        } else if (cartValue < 500) {
            System.out.println("15% discount, Final Value to pay " + (cartValue-cartValue*15/100));
        } else {
            System.out.println("20% discount, Final Value to pay " + (cartValue-cartValue*20/100));
        }

    }

}


/*

2	Discount Calculator

	Write a Java program to calculate the final price of a product after applying a discount based on the following criteria:

	Price < 100: 5% discount
	100 <= Price < 200: 10% discount
	200 <= Price < 500: 20% discount
	Price >= 500: 30% discount

	Hint:

	1. Input: You can either hardcode the price or take it as input from the user using the Scanner class.
	2. Calculation: Calculate the discount amount and the final price.
	3. Output: Print the final price.

	Example:

	If the input price is 350, the output should be:280




 */