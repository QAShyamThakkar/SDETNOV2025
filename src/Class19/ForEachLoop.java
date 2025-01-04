package Class19;

public class ForEachLoop {
    public static void main(String[] args) {

        int num [] = {10,20,30,40,50};

        System.out.println("Normal For Loop");
        for (int i = 0; i < 3; i++) {    //10, 20, 30
            System.out.println(num[i]);
        }

        System.out.println("For Each For Loop");
        for (int element : num) {
            System.out.println(element);
        }

        String str [] = {"Ken", "Ghauri", "Shyam", "vold", "Melissa", "Kris"};

        for (String ken : str){
            System.out.println(ken);
        }

    }

}
