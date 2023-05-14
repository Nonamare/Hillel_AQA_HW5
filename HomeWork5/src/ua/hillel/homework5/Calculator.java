package ua.hillel.homework5;

public class Calculator {
    public static void addition(double first, double second) {
        double result = first + second;
        System.out.println("Sum of " + first + " and " + second + " is " + result);
    }

    public static void subtraction(double first, double second) {
        double result = first - second;
        System.out.println("Subtraction of " + first + " and " + second + " is " + result);
    }

    public static void multiplication(double first, double second) {
        double result = first * second;
        System.out.println("Multiplication of " + first + " and " + second + " is " + result);
    }

    public static void division(double first, double second) {
        double result = first / second;
        System.out.println("division of " + first + " and " + second + " is " + result);
    }
}
