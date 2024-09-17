package se.oscar;

public class CalculatorFelExercise {
    public static void main(String[] args) {
        System.out.println(division(10,0));
    }

    public static int division(int a, int b) {
        int sum = 0;
        try {
            sum = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Kan inte dividera med noll");
        }
        return sum;
    }
}
