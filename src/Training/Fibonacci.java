package Training;

public class Fibonacci {
    static int count = 0;
    static int num=15;
    static int memo[];
    public Fibonacci() {
        memo = new int[num + 1];
        for (int i = 0; i <= num; i++)
            memo[i] = 0;
    }
    public static int fib(int n)
    {
        int sum=0;
        count++;
        System.out.println("Count="+count);
        if(n<0)
            System.exit(0);
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        sum = fib(n-1) + fib(n-2);
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(fib(3));
    }
}
