public class GetAndSet extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        GetAndSet t1 = new GetAndSet();
        GetAndSet t2 = new GetAndSet();

        System.out.println("t1 name: " + t1.getName() + "  |  t1 ID: " + t1.getId());
        System.out.println("t2 name: " + t2.getName() + "  |  t2 ID: " + t2.getId());

        t1.setName("First Thread");
        System.out.println("t1 New Name: " + t1.getName());

        //t1.start();
        //t2.start();

    }
}
