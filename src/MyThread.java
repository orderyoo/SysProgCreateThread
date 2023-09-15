public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток запущен");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            sleep(1000);
            thread.start();
        }
    }
}