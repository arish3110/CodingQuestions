public class Multithread2 implements Runnable {
    public void run(){
        System.out.println("Thead is start");
    }
    public static void main(String[] args) {
        Multithread2 t=new Multithread2();
        Thread t1=new Thread(t);
        t1.start();
    }
}
