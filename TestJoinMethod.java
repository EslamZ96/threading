public class TestJoinMethod extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i + " " + currentThread().getName());
        }
    }

    public static void main(String[] args) {

        TestJoinMethod t1 = new TestJoinMethod();
        t1.setName("thread-1");

        TestJoinMethod t2 = new TestJoinMethod();
        t2.setName("thread-2");

        TestJoinMethod t3 = new TestJoinMethod();
        t3.setName("thread-3");

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
