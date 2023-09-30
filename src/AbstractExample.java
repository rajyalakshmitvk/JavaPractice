abstract class S1 {
    public abstract void display(String msg);
}
class S2 extends S1 {
    public void display(String msg)     {
        System.out.println("Hello Welcome"+msg);
    }}
public class AbstractExample {
    public static void main(String args[])    {
        S2 s = new S2();//= new S1();
        s.display("Hello");    }}