package Class12;


//5 = 5*4*3*2*1

public class Factorial {

    public static void main(String[] args) {

        int fact = 1;

        for (int i = 5; i>=1; i--){
            fact=fact*i;

        }
        System.out.println(fact);

    }
}
