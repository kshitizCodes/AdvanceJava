package Lab5.QN9;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    int sum(int a, int b) throws RemoteException;

    int diff(int a, int b) throws RemoteException;
}
