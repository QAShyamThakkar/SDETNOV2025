package Class12;

public class Sum1to10_sub369 {
    public static void main(String[] args) {

        int sum = 0;

        // 1 + 2 + 3 + 4 + 5  = 15

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                sum = sum - i;
            }else {
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }

}
