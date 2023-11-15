package Training;
import java.util.Scanner;
public class TowersofHanoi {
    int n;
    public void towers(int n, char source, char aux, char target)
    {
        if(n>1) {
            towers(n - 1, source, target, aux);
            System.out.println("Move disk " + n + " from "
                    + source + " to " + target);
            towers(n - 1, aux, source, target);
        }
        else
            System.out.println("Move disk " + n + " from "
                    + source + " to " + target);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks");
        int n = sc.nextInt();
        TowersofHanoi t= new TowersofHanoi();
        t.towers(n,'A','B','C');
    }
}
