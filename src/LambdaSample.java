interface LambdaTest {
    abstract int reverse(int x);
    //abstract void disp();
    default void display(String msg) {
        System.out.println(msg);
    }
}
public class LambdaSample {
    public static void main(String args[]) {
        LambdaTest l = (int n)->{
            int digit,sum=0;
            while(n!=0) {
                digit = n%10;
                sum = sum*10 + digit;
                n = n/10;
            }
            return sum;
        };
        System.out.println(l.reverse(5432));
        l.display("This is Lambda program example");
    }
}
