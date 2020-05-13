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

    public static double divide(double x, double y) {
        //je kan zelf ook fouten maken
        if(y == 0.0 || y == -0.0)
            throw new ArithmeticException("/ by 0");
        return x/y;
    }

    public static int factorial(int input){
        int result = 1;
        for( ;input > 1 ; input--) {
            result *= input; //korter voor resultaat = resultaat * input
        }
        return result;
    }

    //stalone, recursief opgelost
    public static int factorialRecursief(int input){
        if(input < 1)
            return 1;
        return input * factorialRecursief(input - 1);
    }
}
