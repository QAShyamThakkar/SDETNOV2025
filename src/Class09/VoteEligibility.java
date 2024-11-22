package Class09;

public class VoteEligibility {
    public static void main(String[] args) {

        int age = 20;
        String country = "USA";

        if (age>18 && country.equals("USA")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible");
        }



//        if (age > 18) {
//
//            if (country.equals("USA")) {
//                System.out.println("You are eligible to vote");
//            } else {
//                System.out.println("You are not eligible to vote");
//            }
//
//        } else {
//            System.out.println("You are not eligible to vote");
//        }




    }


}
/*
7	Voting Eligibility

	Write a Java program to determine a person's eligibility to vote based on their age and country.

	Criteria:

	Age >= 18 and Country = "USA": Eligible to vote
	Otherwise: Not eligible to vote

	Hint:

	1. Input: You can either hardcode the age and country or take them as input from the user using the Scanner class.
	2. Logic: Use nested if-else statements or logical operators (&&) to check the eligibility conditions.
	3. Output: Print the eligibility status.

	Example:

	If the input age is 20 and country is "USA", the output should be:

	You can vote


 */