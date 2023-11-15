import java.lang.*;
class CurrentThreadDemo
{
    public static void main(String args[])
    {

        Thread t = Thread.currentThread();
        System.out.println("My Thread="+t);
        t.setName("Rajyalakshmi");
        System.out.println("My Thread="+t);
        System.out.println(t.getState());
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                Thread.sleep(2);
                System.out.println(t.getState());
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}