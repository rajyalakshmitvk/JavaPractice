import java.util.*;
class Test
{
    //synchronized
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class SyncThread extends Thread
{
    Test t;
    String msg;
    SyncThread(Test t)
    {
        this.t=t;
        msg=this.getName();
    }
    public void run()
    {
        t.call(this.msg);
    }
}
class SyncThreads
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        Test t1=new Test();
        Test t2=new Test();
        SyncThread s1=new SyncThread(t);
        SyncThread s2=new SyncThread(t1);
        SyncThread s3=new SyncThread(t2);
        s1.start();
        s2.start();
        s3.start();
    }
}		