package Class03;

public class ModulusOperator {

    public static void main(String[] args) {

        //Any number with %2 - Odd Number = 1, Even Number = 2

        System.out.println(9%2);  // 1
        System.out.println(11%2); // 1

        System.out.println(10%2); // 0
        System.out.println(12%2); // 0

        System.out.println(15%2); // 1
        System.out.println(16%2); // 0

        //Any number with %10 - Will get the last number

        System.out.println(156%10);  // 6
        System.out.println(112%10); // 2

        System.out.println(11%10); // 1
        System.out.println(12%10); // 2

        System.out.println(1598%10); // 8
        System.out.println(168%10); // 8

        //Any number with /10 - To Remove the last number

        System.out.println(156/10);  // 15
        System.out.println(112/10); // 11

        System.out.println(11/10); //  1
        System.out.println(12/10); // 1

        System.out.println(1598/10); // 159
        System.out.println(168/10); // 16


    }
}
