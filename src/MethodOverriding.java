class Super {
    public void display() {
        System.out.println("hello Welcome to Superclass");
    }
}
class Second extends Super{
    public void display()     {
        //super.display();
        System.out.println("Welcome to subclass");
    }
}
public class MethodOverriding {
    public static void main(String args[])
    {
        Super f = new Super();
        Second s = new Second();
        f.display();
        System.out.println(f);
        s.display();
        System.out.println(s);
        f=s;
        f.display();
        System.out.println(f);
    }
}
