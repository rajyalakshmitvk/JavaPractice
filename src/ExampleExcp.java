class ExampleExcp
{
    public static void main(String args[])
    {
        try
        {
            int a[]=new int[10];
            System.out.println(a[11]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}