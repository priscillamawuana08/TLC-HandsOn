package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne( 2);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment);
        System.out.println(multiply);
    }
    //(normal function in java which takes an input and return one output)
    /*
    static int increment(int number){
        return number + 1;

     */
    // creating a function that will take a number and increment it by one using "Function<T, R>" functional style way
    static Function<Integer, Integer> incrementByOneFunction = number -> number++;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }
}
