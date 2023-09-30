class SuperClass {
    int i,j;
    SuperClass(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    public void display()
    {
        System.out.println(i+" "+j);
    }
}
class SubClass extends SuperClass
{
    int i,j,k;
    SubClass(int i, int j, int k)
    {
        super(i,j);
        this.i=super.i;
        this.j=super.j;
        this.k=k;
    }
    public void display()
    {
        System.out.println(i+" "+j+" "+k);
        System.out.println(super.i+" "+super.j);
    }
}
public class SuperExample
{    public static void main(String args[])
    {
        SuperClass sc= new SuperClass(10,20);
        SubClass sc1 = new SubClass(15,25,35);
        sc.display();
        sc1.display();
    }}
