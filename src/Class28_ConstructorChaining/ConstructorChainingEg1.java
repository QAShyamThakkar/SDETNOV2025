package Class28_ConstructorChaining;

class Parent1{

    Parent1(){
        System.out.println("1. I am default in Parent");
    }

    Parent1(int a){
        System.out.println("2. I am parameterised const in Parent");
    }

}

class Child1 extends Parent1{

    Child1(){
        super(10);   //-- Java will add this line when we run the code
        System.out.println("3. I am default in Child");
    }

    Child1(int a){
        super(10);
         System.out.println("4. I am parameterised const in Child");
    }

}

public class ConstructorChainingEg1 {

}
