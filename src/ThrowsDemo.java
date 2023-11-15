import java.io.DataInputStream;
import java.io.IOException;
public class ThrowsDemo {
    public static void main(String[] args)throws IOException{
        int a,b;
        DataInputStream dis =new DataInputStream(System.in);
        a = Integer.parseInt(dis.readLine());
        b = Integer.parseInt(dis.readLine());
        System.out.println("a="+a+"b="+b);
    }
}
