package day20_CustomMethods_Overloading;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        //Sum of 10, 20
        int sum = sum(10, 20);
        System.out.println("sum = " + sum);

        //Sum of 10,20,30
        int sum2 = sum(10, 20, 30);
        System.out.println("sum2 = " + sum2);

        //Sum of 10,20,30,40
        int sum3 = sum(10, 20, 30, 40);
        System.out.println("sum3 = " + sum3);

        //Sum of 11.1 and 22.2
        double sum4 = sum(11.1, 22.2);
        System.out.println("sum4 = " + sum4);

        //Sum of 11.1 22.2 33.3
        double sum5 = sum(11.1, 22.2, 33.3);
        System.out.println("sum5 = " + sum5);

        //Sum of 11.1 22.2 33.3 44.4
        double sum6 = sum(11.1, 22.2, 33.3, 44.4);
        System.out.println("sum6 = " + sum6);


    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double sum(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }

}
/*
        1. create a method that can find the sum of two numbers


	    2. create a method that can find the sum of three numbers


	    3. create a method that can find the sum of four numbers
 */