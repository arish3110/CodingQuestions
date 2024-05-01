public class InterruptException extends Thread {
    public void run() {

        try {
            for (int i = 1; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        InterruptException er = new InterruptException();
        er.start();
        er.interrupt();
    }
}
