package Class30_Polymorphism;

class Parent{
    void spendMoney(){
        System.out.println("I am parent, can spend lots of money");
    }
    void drivingCar(){
        System.out.println("Driving");
    }

}
class Child extends Parent{
   @Override
    void spendMoney(){
        System.out.println("I am child, can spend limited to pocket money");
    }
}

public class MethodOverridding {
    public static void main(String[] args) {
        Child c = new Child();
        c.spendMoney();
        c.drivingCar();


    }


}
