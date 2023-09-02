import java.util.Scanner;
public class SimpleArray {
    public static void main ( String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array");
        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of array elements="+sum);
    }
}
