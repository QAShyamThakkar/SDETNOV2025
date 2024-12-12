package Class14;

public class CountDigit {
    public static void main(String[] args) {

        int num = 14523;   //----- 3
        int count =0;

        while (num!=0){

            count++;   //count = count+1;

            num = num / 10; //remove the last number
        }

        System.out.println(count);

    }

}
