package Class05;

//0 - Sun
//1 - Mon
//2 - Tue
//3 - Wed
//4 - Thu
//5 - Fri
//6 - Sat
//7 - Please enter 0 to 6
//8 - Please enter 0 to 6
//1000 - Please enter 0 to 6


import Class04.ifStatement_Eg2;

public class LadderIfElseEg2 {

    public static void main(String[] args) {
        int day = 0;

        if (day==0){
            System.out.println("Sun");
        } else if (day==1){
            System.out.println("Mon");
        } else if (day==2){
            System.out.println("Tue");
        } else if (day==3){
            System.out.println("Wed");
        } else if (day==4){
            System.out.println("Thu");
        }else if (day==5){
            System.out.println("Fri");
        }else if (day==6){
            System.out.println("Sat");
        }else {
            System.out.println("Please enter from 0 to 6");
        }


        System.out.println("Thank you for using the application, never come back");

    }




}
