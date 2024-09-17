package se.oscar;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.divide(10,0));
        } catch (ArithmeticException e) {
            System.out.println("Cant divine by zero");
        }
    }
}
