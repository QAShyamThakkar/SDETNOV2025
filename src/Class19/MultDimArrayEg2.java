package Class19;

public class MultDimArrayEg2 {
    public static void main(String[] args) {

        int num[][] = {{10, 20, 30},
                        {40, 50, 60},
                        {70, 80, 90}};


        System.out.println(num[1][1]);
        System.out.println(num[0] [0]); //10
        System.out.println(num[0] [1]); //20
        System.out.println(num[0] [2]); //30

//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println();

        System.out.println(num.length);

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }


}
