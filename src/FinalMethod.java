class SuperA
{
    int i;
    int j=20;
    final void show()
    {
        System.out.println("i="+i);
    }
    private void showP()
    {
        System.out.println("i="+i);
    }
}
class B extends SuperA
{
    void showJ()
    {
        j=25;
        super.show();
        //super.showP();//private method cannot be accessed with super
        System.out.println("i="+i+" j="+j);
    }
    /*void show()//cannot be overridden
    {
    }*/
}
class FinalMethod
{
    public static void main(String args[])
    {
        B b=new B();
        b.i=10;
        b.show();
    }
}