package Class04;

public class TypeCasting {

    public static void main(String[] args) {

//        Explicit Type Casting - Bigger Value into smaller data type
        int a = (int)10.10;
        System.out.println(a); //10.10


//        Implied Type Casting - Small Value into Big Data Type
        double d = 10;
        System.out.println(d); //


        double d1 = 10.60;
        int y = (int)d1;


            int b = (int)76879980345678987l;
        System.out.println(b);


        byte c = (byte)257;   //== 128-256
        System.out.println(c);



    }

}
