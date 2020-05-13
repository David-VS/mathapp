package be.ehb.mathapp.utils;

public class Calculator {

    public static int sum(int a, int b){
        return b + a;
    }

    public static int absolute(int a){
        return Math.abs(a);
    }

    public static double power(double x, double e){
        return Math.pow(x, e);
    }

    public static int divide(int x, int y) {
        return x/y;
    }

    public static int factorial(int input){
        int result = 1;
        for ( ;input > 1 ; input--)
            result *= input;
        return result;
    }
}
