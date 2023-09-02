//Program to check whether given number is positive
import java.util.Scanner;
public class IfProgram {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number:");
        //Create object for Scanner class
        Scanner scanner = new Scanner(System.in);
        //Read a value
        num = scanner.nextInt();

        //Check whether num is positive
        if(num > 0) {
            System.out.println(num + " is positive ");
        }
    }
}
