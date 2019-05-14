public class CurrentThreadMethod extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CurrentThreadMethod t1 = new CurrentThreadMethod();
        CurrentThreadMethod t2 = new CurrentThreadMethod();

        t1.start();
        t2.start();

    }
}
