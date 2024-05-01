public class yiledThread extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println(Thread.currentThread().getName()+ "myThread");
        }
    }
    public static void main(String[] args) {
        yiledThread y1=new yiledThread();
        yiledThread y2=new yiledThread();
        y1.start();
        y2.start();

        for(int i=1;i<3;i++){
            y1.yield();
            System.out.println(Thread.currentThread().getName() +"  myThread1");
        }
    }
}
