package Class28_ConstructorChaining;

class Parent {
    int a = 10;
}

class Child extends Parent{
    int a = 20;
    int b = 100;

    void print(){
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    static void print1(){
        int a = 30;
//        System.out.println(this.a); // ONly Static variable are allowed
//        System.out.println(super.a); // ONly Static variable are allowed
    }


}

public class aThisandSuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.print(); //30
    }

}
