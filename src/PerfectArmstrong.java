/*Java program to check whether given number is perfect
(or armstrong) or not
*/
import java.util.Scanner;
public class PerfectArmstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, result = 0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (int i=1; i<num;i++) {
            if( num % i == 0) {
                result += i;
            }
        }
        if( result == num) {
            System.out.println(num + " is a perfect number");
        }
        else
            System.out.println(num + " is not a perfect number");
        int sum = 0;
        int temp = num;
        while(num != 0) {
            int digit = num % 10;//Remainder
            sum += digit * digit * digit;//Sum of cubes of ind digits
            num /= 10;//Updating number
        }
        if( temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        }
        else
            System.out.println(temp + " is not an Armstrong number");
    }





}
