import java.util.Scanner;
public class FactRecursion {
    public static void main ( String args[]) {

        int num;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        long result = fact ( num );
        System.out.println(" Factorial of "+ num+ " is " + result);
    }

    public static long fact(int num) {
        if( num == 0)
            return 1;
        else
            return num * fact(num - 1);
    }
}
