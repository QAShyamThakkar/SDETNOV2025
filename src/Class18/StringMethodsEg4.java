package Class18;

public class StringMethodsEg4 {

    public static void main(String[] args) {

        String str1 = "Good Evening Everyone";   //array of char

//        5. Length of String
        System.out.println(str1.length());//t

//        6. Char at specific index
        System.out.println(str1.charAt(20));//e
//       System.out.println(str1.charAt(21));//error

//        7. loop in string
        for (int i = 0; i < str1.length()-1; i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        for (int i = str1.indexOf("Evening"); i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        //8. To find index of char
        System.out.println(str1.indexOf('E'));

        //9. To find index of String
        System.out.println(str1.indexOf("Evening"));






    }

}
