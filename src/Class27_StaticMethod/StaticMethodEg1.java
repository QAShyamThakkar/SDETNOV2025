package Class27_StaticMethod;

class Market{

    int itemNum;
    String item;

    Market(){
        System.out.println("Welcome");
    }

    void shopping (){
        System.out.println("Lets buy" + item);
    }

    void payment (){
        System.out.println("Lets do payment");
    }
    static void print(){
//        System.out.println(itemNum); only static variables are allowed under static method
//        System.out.println(item);
    }

}

public class StaticMethodEg1 {

    public static void main(String[] args) {
      Market m1 = new Market();




    }


}
