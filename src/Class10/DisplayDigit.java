package Class10;

public class DisplayDigit {

    public static void main(String[] args) {

        int num = 384868067;

        while (num > 0) {

            System.out.println(num % 10);

            num = num / 10;   //decrement
        }


        //7
        //6
        //8
        //4
        //9
        //3


    }


}
