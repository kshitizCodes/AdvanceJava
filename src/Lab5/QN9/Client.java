package Lab5.QN9;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");
            int sum = calculator.sum(10, 5);
            int diff = calculator.diff(10, 5);
            System.out.println("Sum: " + sum);
            System.out.println("Diff: " + diff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
