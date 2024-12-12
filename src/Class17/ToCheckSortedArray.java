package Class17;

public class ToCheckSortedArray {

    public static void main(String[] args) {

        int num[] = {1, 2, 4, 5, 8, 10, 8};
        int result = 0;

        for (int i = 0; i < num.length - 1; i++) {
//            System.out.print(num[i] + " ");
//            System.out.println(num[i+1]);

            if (num[i] < num[i + 1]) {
                result = 0;
            } else {
                result = 1;
            }
        }

        System.out.println("Result = " + result);
        if (result == 0) {
            System.out.println("It is sorted");
        } else {
            System.out.println("It is not sorted");
        }


    }


}
