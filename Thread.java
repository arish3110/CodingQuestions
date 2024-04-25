class Thread1 extends Thread{
    public void run(){
        System.out.println("My thread is running");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("My thread is starting");
    }
}


class Multithread {
    public static void main(String[] args) {
        Thread1 mt1 =new Thread1();
        mt1.start();
        Thread2 mt2 =new Thread2();
        mt2.start();
    }
}