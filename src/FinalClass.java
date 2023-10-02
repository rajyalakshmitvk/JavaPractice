final class FA1
{
    final int i=30;
    void show()
    {
        System.out.println("i="+i);
    }
}
/*class B1 extends A1//causes error
{
}*/
class FinalClass
{
    public static void main(String args[])
    {
        FA1 a = new FA1();
        //a.i=20;
        a.show();
   /*     B1 b=new B1();
        b.i=10;
        b.show();*/
    }
}