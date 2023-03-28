package day20_CustomMethods_Overloading;

import java.util.Scanner;

public class C01_NameOfDay {
    // Create a method that returns the name of the day based on the given number to the method

    public static void main(String[] args) {
      //  System.out.println("nameOfDay(9) = " + nameOfDay(9));
     //   System.out.println("nameOfDay(5) = " + nameOfDay(5));

        System.out.println(twoNumber());


    }
    public static String nameOfDay(int number){
        String result="";

        if(number<1 || number>7) {   // if the number is invalid
           result="Invalid";
        } else if (number==1) {
            result="Monday";
        } else if (number==2) {
            result="Tuesday";
        } else if (number==3) {
            result="Wednesday";
        } else if (number==4) {
            result="Thursday";
        } else if (number==5) {
            result="Friday";
        } else if (number==6) {
            result="Saturday";
        }else {
            result="Sunday";
        }
        return result;
    }


    public static int twoNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1 sayı:");
        int num1=scanner.nextInt();
        System.out.println("2 sayı");
        int num2=scanner.nextInt();
        int result=0;
        if(num2%3!=0){
            result=multipleOfThree(num2);
        }
        System.out.println(totalTwo(num1, num2));
        return result;
    }

    public static int multipleOfThree(int i){
        int result1=i*3;
        return result1;
    }

    public static int totalTwo(int i, int j){
        int result2=i+j;
        return result2;
    }






}
