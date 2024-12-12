package Class17;

public class SeperatePositiveandNegative {

    public static void main(String[] args) {

        int num[] = {-1, 2, 5, -6, 9, 10};

        int PN[] = new int[num.length];
        int NN[] = new int[num.length];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                PN[i] = num[i];
            } else {
                NN[i] = num[i];
            }

        }

        System.out.println("Positive");
        for (int i = 0; i < PN.length; i++) {
            System.out.println(PN[i]);
        }

        System.out.println("Negative");
        for (int i = 0; i < NN.length; i++) {
            System.out.println(NN[i]);
        }


    }


}
