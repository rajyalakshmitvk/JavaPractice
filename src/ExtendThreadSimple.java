class NewThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(" " + this);
            } catch (InterruptedException e) {
            }
        }
    }
}
class SecondThread extends Thread {
    public void run()
    {
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
                System.out.println(" "+this);
            }catch(InterruptedException e){}
        }
    }
}
public class ExtendThreadSimple{
    public static void main(String args[ ] ) 	{
        Thread t=Thread.currentThread();
        t.setPriority(9);
        NewThread t1 = new NewThread();
        t1.setName("NewThread");
        t1.setPriority(2);
        t1.start();
        SecondThread s1=new SecondThread();
        s1.setName("SecondThread");
        s1.setPriority(6);
        s1.start();
        System.out.println(Thread.currentThread());
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println("MainThread"+t);
            }
            catch(InterruptedException e)
            {

            }
        }
        System.out.println("Main thread exiting.");
    }
}