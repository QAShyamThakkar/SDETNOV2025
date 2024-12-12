package Class15;


/*
    *
   ***
  *****
 *******
*********
*/
public class NestedForLoopEg8 {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {     //Outer forloop // Row

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {  //inner forloop // column
                System.out.print("*");   //30
            }

            for (int j = 1; j <=i-1 ; j++) {  //inner forloop // column
                System.out.print("*");   //30
            }

            System.out.println();

        }


    }

}
