package Class14;

public class SeperateEachDigit {
    public static void main(String[] args) {

        int num = 14523;   //----- 3

        while (num!=0){

            System.out.println(num % 10);  //get the last number

            num = num / 10; //remove the last number
        }

//        System.out.println(num % 10);// 3
//        num = num / 10;  //1452
//
//        System.out.println(num % 10);// 2
//        num = num / 10;  //145
//
//        System.out.println(num % 10); //5
//        num = num / 10;  //14
//
//        System.out.println(num % 10);  //4
//        num = num / 10;  //1
//
//        System.out.println(num % 10); //1
//        num = num / 10; //0
    }

}
