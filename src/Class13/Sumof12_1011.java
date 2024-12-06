package Class13;

// Print result of 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 + 10/11


public class Sumof12_1011 {

    public static void main(String[] args) {

        double sum = 0;

        for (double i = 1; i <= 10; i++) {

            sum = sum + i / (i + 1);
        }

        System.out.println(sum);

//        System.out.printf("%.2f%n", sum); //to print only two decimal points


    }


}
