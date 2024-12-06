package Class13;

//Print the result of 1^2 + 2^2 + 3^2 + 4 ^2 + 5^2 ….+10^2

public class Sumof2power {
    public static void main(String[] args) {

        //2^2 ---  2*2 = 4
        //3^2 ---  3*3 = 9
        //4^2 ---- 4*4 = 16
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum = sum + i*i ;
        }

        System.out.println(sum);

    }

}


// 4*3 = 12
// 4^3 = 4*4*4 =