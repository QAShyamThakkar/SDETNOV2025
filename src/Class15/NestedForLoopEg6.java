package Class15;


/*
1
22
333
4444
55555
*/
public class NestedForLoopEg6 {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {     //Outer forloop // Row

            for (int j = 1; j <=i ; j++) {  //inner forloop // column
                System.out.print(i);   //30
            }
            System.out.println();

        }


    }

}
