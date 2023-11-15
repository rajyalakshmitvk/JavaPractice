import java.io.DataInputStream;
import java.io.IOException;
public class FinallyDemo {
    public static void main(String[] args)    {
        try        {
            DataInputStream dis=new DataInputStream(System.in);
            int a= Integer.parseInt(dis.readLine());
            System.out.println("a="+a);
            //System.exit(0);
        }
        catch(IOException e)        {
            System.out.println(e.getMessage());
        }
        /*finally
        {
            System.out.println("This will be printed at last");
        }*/
        System.out.println("Hello");
    }
}
