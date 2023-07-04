package Lab5.QN6;

import java.rmi.*;

public interface Calculator extends Remote {
    int sum(int a, int b) throws RemoteException;

    int diff(int a, int b) throws RemoteException;
}
