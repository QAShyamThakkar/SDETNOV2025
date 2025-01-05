package Class23_ClassAndObject;

public class PhoneTest {

    public static void main(String[] args) {
        PhoneClass  iPhone  = new PhoneClass();
        PhoneClass  moto    = new PhoneClass();

        iPhone.RAM = 16;
        iPhone.color = "Red";
        iPhone.brand = "Apple";
        iPhone.camara = 2000;

//        System.out.println(iPhone.RAM);
//        System.out.println(iPhone.color);
//        System.out.println(iPhone.brand);
//        System.out.println(iPhone.camara);

        iPhone.calling("shyam");
//        iPhone.chat();
//        iPhone.photo();

//        moto.chat();
//        moto.photo();
        moto.calling("Home");





    }

}
