// Creating thread by extending Thread class
public class UsingThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("thread is running");
    }

    public static void main(String[] args) {

        UsingThread thread = new UsingThread();
        thread.start();
    }
}
