package Class28_ConstructorChaining;

class Parent2{

    Parent2(){
        System.out.println("1. I am default in Parent");
    }

    Parent2(int a){
        System.out.println("2. I am parameterised const in Parent");
    }

}

class Child2 extends Parent1{

    Child2(){
        this(10);
        System.out.println("3. I am default in Child");
    }

    Child2(int a){
//        this();
         System.out.println("4. I am parameterised const in Child");
    }

    Child2(String a){
//        this();
        System.out.println("4. I am parameterised const in Child");
    }

}

public class ConstructorChainingEg2 {

}
