package Class16;

public class SumOFArrayEvenNum {
    public static void main(String[] args) {

        //1. Declaration and initialization of Array
        int marks[] = {91, 92, 100, 95, 96}; //Array
        int sum = 0;

        //4. Print all the value

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] % 2 == 0) {
                sum = sum + marks[i];
            }

        }

        System.out.println(sum);


    }


}
