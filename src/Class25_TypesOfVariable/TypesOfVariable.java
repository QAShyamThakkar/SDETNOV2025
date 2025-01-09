package Class25_TypesOfVariable;

import Class11.forloopeg1;

class Demo {
    int a = 10;    // Instance variable    // 2
    static int b;  // Static Variable      // 1

    void method1() {
        int a = 20;        //Local Variable
        System.out.println(a);
    }

    void method2() {

        System.out.println(a);
    }

}
public class TypesOfVariable {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
        d.method2();



    }

}
