package Lab2.QN1;

public class UsingRunnable implements Runnable {
    int id;

    UsingRunnable(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        UsingRunnable runnable1 = new UsingRunnable(1);
        UsingRunnable runnable2 = new UsingRunnable(2);
        Thread r1 = new Thread(runnable1);
        Thread r2 = new Thread(runnable2);
        r1.start();
        r2.start();
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.id + " running!");
    }
}
