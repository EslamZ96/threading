// Making thread by implementing  Runnable interface
public class UsingRunnable implements Runnable{

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {

        UsingRunnable job = new UsingRunnable();
        Thread thread = new Thread(job);
        thread.start();
    }
}
