import java.util.Scanner;
public class ArithmeticClass {
    public static void main(String args[])  {
       System.out.println("Enter two numbers:");
       int num1, num2;
       Scanner sc = new Scanner(System.in);
       num1 = sc.nextInt();
       num2 = sc.nextInt();
       int choice;
       System.out.println("Enter your choice:" +
               "\n1. Addition" +
               "\n2. Subtraction" +
               "\n3. Multiplication" +
               "\n4. Division" +
               "\n5. Remainder");
       //System.out.println("Enter your choice:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Remainder\n");
       choice = sc.nextInt();
       int result;
       switch (choice) {
           case 1: result = num1 + num2;
                   System.out.println("Addition result = "+result);
                   break;
           case 2: result = num1 - num2;
                   System.out.println("Subtraction result = "+result);
                   break;
           case 3: result = num1 * num2;
                   System.out.println("Multiplication result = "+result);
                   break;
           case 4: result = num1 / num2;
                   System.out.println("Division result = "+result);
                   break;
           case 5: result = num1 % num2;
                   System.out.println("Remainder = "+result);
                   break;
           default:
               System.out.println("Invalid Choice\n");
       }
    }
}
