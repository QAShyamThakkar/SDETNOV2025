package Class07;

//Age >= 18 and Weight >= 50: Eligible
//Age >= 18 and Weight < 50: Underweight
//Age < 18 and Weight >= 50: Too young
//Age < 18 and Weight < 50: Not eligible

public class NestedEg1_BloodDonation {

    public static void main(String[] args) {

        //Input
        int age = 24;
        int weight = 45;

        // Logic and Output
        if (age>18){
                if (weight>50){
                    System.out.println("You are eligible");
                }else {
                    System.out.println("You are Underweight");
                }

        }else {

            if (weight>50){
                System.out.println("You are Too young");
            }else {
                System.out.println("You are not eligible");
            }
        }



    }



}
