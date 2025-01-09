package Class25_TypesOfVariable;

class Car{
  static int numOFCars;

  Car(){
     numOFCars++;
  }
}

public class StaticEg1 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        Car c4 = new Car();
        Car c5 = new Car();


        System.out.println(c3.numOFCars); //1

    }

}


