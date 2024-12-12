package Class14;

public class MaxDigit {
    public static void main(String[] args) {

        int num = 14523;   //----- 3
        int bigNum = 0;

        while (num != 0) {

            if (num % 10 > bigNum) {
                bigNum = num % 10;
            }

            num = num / 10; //remove the last number
        }

        System.out.println(bigNum);

    }

}
