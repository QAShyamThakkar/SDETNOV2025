package Class26_StaticKeyword;

class Bike {

    int bigNumFromUser = 10;
    double PAI = 3.14;
    
    int speed;
    static int price;

    void updateData(int price, int speed) {

        this.price=price;

        this.speed=speed;
    }

    void printData() {
        System.out.println(price);
    }
}

public class Example1 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.price=100;

        Bike b2 = new Bike();
        b2.price=200;

        b2.updateData(300,200);
//
//        b1.printData();
//        b2.printData();

        System.out.println(b1);

        int add = 10;
        System.out.println(add);
          //0 0
    }


}
