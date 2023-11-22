import java.lang.Math;
class SampleThread extends Thread
{
    int num;
    SampleThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        //int range=0;
        try {

                int range = (int) (Math.random() * num);
                System.out.println("range="+range);
                if (range % 2 == 0)
                    new SquareThread(range).start();
                else
                    new CubeThread(range).start();
                Thread.sleep(1000);
        }
        catch(InterruptedException e){ }
    }
}
class SquareThread extends Thread
{
    int num;
    SquareThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        System.out.println("Square="+num*num);
    }
}
class CubeThread extends Thread
{
    int num;
    CubeThread(int num)
    {
        this.num = num;
    }
    public void run()
    {
        System.out.println("Cube="+num*num*num);
    }
}
public class Program13 {
    public static void main(String args[])
    {
        SampleThread s= new SampleThread(20);
        s.start();
    }
}
