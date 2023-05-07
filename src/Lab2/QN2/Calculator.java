package Lab2.QN2;

import java.util.Scanner;

public class Calculator {
    double a, b;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.takeInput();
        try {
            System.out.printf("%.2f\n", calc.divide());
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public void takeInput() {
        System.out.print("Enter a number: ");
        this.a = Double.parseDouble(scan.nextLine());
        System.out.print("Enter another number: ");
        this.b = Double.parseDouble(scan.nextLine());
    }

    public double divide() {
        if (b == 0)
            throw new ArithmeticException("Division By 0 occurred!");
        return a / b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }
}
