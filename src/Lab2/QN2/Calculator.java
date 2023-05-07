package Lab2.QN2;

import java.util.Scanner;

public class Calculator {
    double num1, num2;
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
        this.num1 = Double.parseDouble(scan.nextLine());
        System.out.print("Enter another number: ");
        this.num2 = Double.parseDouble(scan.nextLine());
    }

    public double divide() {
        if (num2 == 0)
            throw new ArithmeticException("Division By Zero occurred!");
        return num1 / num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }
}
