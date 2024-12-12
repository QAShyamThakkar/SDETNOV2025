package Class14;

public class SumDigit {
    public static void main(String[] args) {

        int num = 14523;   //----- 3
        int sum = 0;

        while (num != 0) {

            sum = sum + num%10;   //count = count+1;

            num = num / 10; //remove the last number
        }

        System.out.println(sum);

    }

}
