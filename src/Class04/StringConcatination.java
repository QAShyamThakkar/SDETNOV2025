package Class04;

public class StringConcatination {


    public static void main(String[] args) {

        //input
        String s1 = "Hello";
        String s2 = "World";
        String s3 = " ";
        int a = 10;
        int b = 20;

//        System.out.println(s1+s2);//HelloWorld
        System.out.println(s1+s2+a+b); // HelloWorld1020
        System.out.println(s1+s2+(a+b)); // HelloWorld30
        System.out.println(s1+s2+a*b); //  HelloWorld200
//        System.out.println(s1+s2+a-b); //Error
        System.out.println(s1+s2+(a-b)); //HelloWorld-10
        System.out.println("s1"+a+b); //s130, Hello30, Hello1020, 30, s11020

    }
}
