package Class33_ReviewClass;

class Demo {
    int a = 10;
    static int b = 20;

    void test() {
        int c = 30;
        System.out.println(c);
    }

    static void getVariable(){
        System.out.println(b);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Demo demoObj = new Demo();     //to access instance, we need object
        System.out.println(demoObj.a);

        System.out.println(Demo.b); //to access static, we need claasName.variable
        Demo.getVariable();

        demoObj.test();//to access local, we need call method

    }

}
