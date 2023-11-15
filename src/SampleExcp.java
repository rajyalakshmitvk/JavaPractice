import java.util.Scanner;
public class SampleExcp {
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            if (b > 0) {
                c = a / b;
                System.out.println("c=" + c);
            }
        }
        catch(Exception e){System.out.println(e);}
        //catch(ArithmeticException e){System.out.println(e);}
    }
}