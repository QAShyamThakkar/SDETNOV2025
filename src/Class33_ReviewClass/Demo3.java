package Class33_ReviewClass;

class DemoD4{
    DemoD4(){
        System.out.println("I am parent");
    }

    void test(){
        System.out.println("I am parent method");
    }

}

class DemoD5 extends DemoD4{
    DemoD5(){
        System.out.println("I am child");
    }

    void test(){
        System.out.println("I am child method");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        DemoD5 d5 = new DemoD5();
        d5.test();

    }

}
