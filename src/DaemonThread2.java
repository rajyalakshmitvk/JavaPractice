public class DaemonThread2 extends Thread {

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args){
        DaemonThread2 t1=new DaemonThread2();
        t1.start();
        // It will throw IllegalThreadStateException
        t1.setDaemon(true);
    }
}