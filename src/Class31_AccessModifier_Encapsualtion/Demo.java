package Class31_AccessModifier_Encapsualtion;

public class Demo{

    private static String s1 = "Private";
    public String s2 = "Public";
    String s3 = "Default";
    protected static String s4 = "Protected";

    String s5 = s1;

    public static void main(String[] args) {
        Demo d = new Demo();

//        System.out.println(d.s1);
        System.out.println(d.s2);
        System.out.println(d.s3);
        System.out.println(d.s4);


    }

}

