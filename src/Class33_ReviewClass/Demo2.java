package Class33_ReviewClass;

class DemoD {
    int a = 10;

}

class DemoD1 extends Demo {
    int a = 20;

    void test1 () {
        int a =50;
        System.out.println(a); //50
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

public class Demo2 extends DemoD{
    public static void main(String[] args) {




    }

}
