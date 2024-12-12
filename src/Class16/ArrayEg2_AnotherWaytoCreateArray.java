package Class16;

public class ArrayEg2_AnotherWaytoCreateArray {
    public static void main(String[] args) {

        int i;
        i = 0;

        //Declaration of Array
//        int num[];

        //initialise
//        num = new int[5];


        int num[] = new int[5];

        num[0] = 10;
        num[1] = 20;
        num[2] = 30; //100
        num[3] = 40;
        num[4] = 50;


        num[2] = 100;

        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);  //0
        }


    }


}
