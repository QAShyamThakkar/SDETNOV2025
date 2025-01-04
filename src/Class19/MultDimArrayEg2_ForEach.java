package Class19;

public class MultDimArrayEg2_ForEach {
    public static void main(String[] args) {

        int ken[][] = {{10, 20, 30},
                        {40, 50, 60, 70},
                        {70, 80, 90}};

//        for (int i = 0; i < num.length; i++) {
//
//            for (int j = 0; j < num.length; j++) {
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int row[] : ken){
            for (int columnElement:row){
                System.out.print(columnElement + " ");
            }
            System.out.println();

        }

    }


}
