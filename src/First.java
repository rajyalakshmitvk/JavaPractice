import java.util.Scanner;
public class First {
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.println("Enter n value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            //System.out.println(args[1]);
        }
        System.out.println("Sum of first "+n+ " numbers is "+sum);
    }
}
