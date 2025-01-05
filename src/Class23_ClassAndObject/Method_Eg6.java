package Class23_ClassAndObject;

public class Method_Eg6 {

    public static void main(String[] args) {

         int result = fact(3);
        fact(5);
    }


    public static int fact(int num) {

        int fact = 1;

        for (int i = num; i>=1; i--){
            fact=fact*i;

        }
        return fact;

    }


}
