package Class11;

public class PrintNumberfrom1to50DivBy5 {
    public static void main(String[] args) {

        // 5 10 15 20 25 30 35 40 45 50


        for (int i = 1; i<=50; i++){

            if (i%5==0 && i%3==0) {
                System.out.println(i);
            }
        }
    }
}
