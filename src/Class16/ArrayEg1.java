package Class16;

public class ArrayEg1 {
    public static void main(String[] args) {
        int numk = 91;
        int numkn = 92;
        int numv = 100;
        int numg = 95;
        int numm = 96;


        //1. Declaration and initialization of Array
        int marks[] = {91, 92, 100, 95, 96}; //Array


        //2. Print value from Array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
//        System.out.println(marks[6]); // Error Index 6 out of bounds for length 5

        //3. Find length of array
        System.out.println(marks.length); //5

        //4. Print all the value

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }



    }


}
