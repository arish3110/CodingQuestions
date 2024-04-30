public class Deamon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread executing");
        }
        else{
            System.out.println("User/Normal thread executing");
        }
       
    }
    public static void main(String[] args) {
        Deamon t1=new Deamon();
        Deamon t2=new Deamon();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}

