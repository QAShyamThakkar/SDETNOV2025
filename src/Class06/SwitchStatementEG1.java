package Class06;

//1 .When we have  multiple condition to check
//2. Can we have duplicate case value - No
//3. break - it will stop the flow of execution
//4. default - When we have execute statement, if the criteria does not match with case value
//5. All data types are allowed, except double and float

public class SwitchStatementEG1 {
    public static void main(String[] args) {

      // nested & Logical ope - 2 classes
      //

       int day = 8;

        switch (day) {

            case 0: System.out.println("Sun");break;
            case 1: System.out.println("Mon");break;
            case 2: System.out.println("Tue");break;
            case 3: System.out.println("Wed");break;
            case 4: System.out.println("Thu");break;
            case 5: System.out.println("Fri");break;
            case 6: System.out.println("Sat");break;

            default: System.out.println("Thank you for using the application, please enter 0 to 6");

        }



//        System.out.println("Thank you for using the application, never come back");


    }

}
