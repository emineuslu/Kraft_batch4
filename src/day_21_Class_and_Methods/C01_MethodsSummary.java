package day_21_Class_and_Methods;

public class C01_MethodsSummary {

    public static void main(String[] args) {
        int x=max(5,10)*10;
        System.out.println(x);

    }

    public static  int max(int x,int y){
        int max;
        if(x>y) {
                max = x;
        }
        else {
            max = y;
        }
       return max;
    }

    public static  int max2(int x,int y){

        if(x>y) {
          return x;
        }
        else {
           return y;
        }

    }
}
