package Class12;

public class Sum1to10_EvenNumber {
    public static void main(String[] args) {

        int sum = 0;

        // 1 + 2 + 3 + 4 + 5  = 15

        for (int i = 2; i <= 10; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }

}
