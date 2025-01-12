package Class27_StaticMethod;

public class Calculator {
    //parent

    String s = "Welcome to the calculator";
    void add(int a, int b) {
        System.out.println("Addition is = " + a + b);
    }
    void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class AdvCalculator extends Calculator { //child
    void mul(int a, int b) {
        System.out.println(a * b);
    }
    void div(int a, int b) {
        System.out.println(a / b);
    }
}

class MultiAdvCalculator extends Calculator {
    void modulo(int a, int b){
        System.out.println(a%b);

    }
}





