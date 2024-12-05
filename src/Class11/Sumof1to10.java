package Class11;

public class Sumof1to10 {
    public static void main(String[] args) {

        // Sum of 1 to 10  == 55 //

        int sum = 1;

        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
             sum = sum + i;
            //    1=0+1  sum=1
            //     3=1+2 sum=3
            //      6=  3+3 sum=6
            //           6+4 sum=10

        }
        System.out.println(sum);


        //10

    }

}
