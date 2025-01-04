package Class18;

public class StringMethodsEg1 {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");

        String str4 = "hello";

//        System.out.println(str3==str2);

//        System.out.println(str1==str2);

        //1. Equality of String
        System.out.println(str3.equals(str2)); //t
        System.out.println(str1.equals(str4)); //f
        System.out.println(str1.equalsIgnoreCase(str4)); //t


    }

}
