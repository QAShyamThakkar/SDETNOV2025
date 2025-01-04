package Class22_UserDefinedMethods;

public class MethodEg4 {

    public static void main(String[] s) {

        int result = maxNum(10,20);
        System.out.println(result/5);  //4  4

    }

    public static int maxNum(int a, int b) {
        if (a>b){
            return a;
        }else {
            return b;
        }

    }


}
