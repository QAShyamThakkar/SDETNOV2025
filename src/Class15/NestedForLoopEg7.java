package Class15;


/*
    1
   12
  123
 1234
12345
*/
public class NestedForLoopEg7 {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {     //Outer forloop // Row

            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {  //inner forloop // column
                System.out.print(j);   //30
            }
            System.out.println();

        }


    }

}
