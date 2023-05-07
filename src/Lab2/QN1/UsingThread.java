package Lab2.QN1;

public class UsingThread extends Thread {
    int id;

    UsingThread(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UsingThread thread1 = new UsingThread(1);
        UsingThread thread2 = new UsingThread(2);
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.id + " running!");
    }
}
