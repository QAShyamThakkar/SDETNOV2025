package Class06;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean b1 = true, b2 = true;
        boolean b3 = true, b4 = false;
        boolean b5 = false, b6 = true;
        boolean b7 = false, b8 = false;

//        System.out.println(b1&&b2 || b3&&b4); //T
//        System.out.println(true || b3&&b4 || b5&&b6 || b7&&b8 ); //T

        System.out.println(!b1);


        System.out.println(b1||b2);
        System.out.println(b3||b4);
        System.out.println(b5||b6);
        System.out.println(b7||b8);

//        System.out.println(b1&&b2);
//        System.out.println(b3&&b4);
//        System.out.println(b5&&b6);
//        System.out.println(b7&&b8);






    }



}
