//Default methods are introduced from Java 1.8
interface Default
{
    public void display();
    default public void show() {
        System.out.println("If this function is " +
                "not overridden " +
                "in implementation class " +
                "no error is raised");
    }
}
public class DefaultImpl implements Default{
    @Override
    public void display() {
        System.out.println("This is abstract method" +
                "not a default method");
    }
    @Override
    public void show(){
        System.out.println("This is in impl class");
    }
    public static void main(String args[])
    {
        DefaultImpl d = new DefaultImpl();
        d.display();
        d.show();
    }
}
