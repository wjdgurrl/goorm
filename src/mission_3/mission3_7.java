package mission_3;

// TODO: 2024-11-11
// 쓰레드 2개 동시 실행
class NumberPrinter implements Runnable {
    private final int threadId;

    public NumberPrinter(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("쓰레드" + threadId + "-" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class mission3_7 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberPrinter(1));
        Thread thread2 = new Thread(new NumberPrinter(2));
        thread1.start();
        thread2.start();
    }
}



