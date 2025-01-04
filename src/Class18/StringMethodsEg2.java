package Class18;

public class StringMethodsEg2 {

    public static void main(String[] args) {


        String str1 = "Hello Max, Welcome to the world of Java";
        String str2 = "hello";

//        2. contains
        System.out.println(str1.contains("Java"));//t
        System.out.println(str1.contains(str2)); //f

//        3. Convert the cases
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toLowerCase().contains(str2)); //t
        System.out.println(str1.toUpperCase());






    }

}
