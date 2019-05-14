public class TestSleepMethod extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod ss = new TestSleepMethod();
        ss.run();
    }
}
