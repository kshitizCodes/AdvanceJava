package Lab5.QN9;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculatorService", calculator);
            System.out.println("Server started successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
