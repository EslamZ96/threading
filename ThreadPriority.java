public class ThreadPriority extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Hello from another thread");
    }

    public static void main(String[] args) {
        ThreadPriority thread1 = new ThreadPriority();
        thread1.setPriority(MIN_PRIORITY); // MIN_PRIORITY (1)

        ThreadPriority thread2 = new ThreadPriority();
        thread1.setPriority(MAX_PRIORITY); // MAX_PRIORITY (10)

        ThreadPriority thread3 = new ThreadPriority();
        thread1.setPriority(NORM_PRIORITY); // NORM_PRIORITY (5)

        System.out.println("Thread1 priority: " + thread1.getPriority());
        System.out.println("Thread2 priority: " + thread2.getPriority());
        System.out.println("Thread3 priority: " + thread3.getPriority());
    }
}
