package Class13;

public class PrimeNum {
    public static void main(String[] args) {

        int num = 13;
        int count=0;

        for (int i=1; i<=num; i++){

            if (num%i==0){
                count++;     //1,13
            }

        }
        System.out.println(count);

        if (count==2){
            System.out.println("it is a prime number");
        }else {
            System.out.println("it is not a prime number");
        }


        //1,2 5,10, 25, 50


    }

}
