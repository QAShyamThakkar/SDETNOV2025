package Class30_Polymorphism;

class AmazonAccount{

    void createAccount(String name, String email, String password){
        //Number of Parameters 3;
    }

    void createAccount(String email, String password){
        //Number of Parameters 2;
    }

    void createAccount(int phoneNumber, String password){
    //Number of Parameters 2; Type of parameters are different
    }

    void createAccount(String password, int phoneNumber){
        //Number and Type of parameters are same, Sequence is different
    }

//    void createAccount(int phoneNumber1, String password1){
//
//    }


//    void createAccount(String password, String email){
//
//    }

}




public class MethodOverloading {

    public static void main(String[] args) {
        AmazonAccount a1 = new AmazonAccount();
        a1.createAccount(98787767, "123");
        a1.createAccount("Shyam", "test@gmail.com", "1234");
        a1.createAccount("Vold", "test!@.com");


    }


}
