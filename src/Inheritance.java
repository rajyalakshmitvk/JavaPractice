class Inh {
    public Inh()
    {
        System.out.println("Hello");
    }
}
class Sub extends Inh {
    public Sub()
    {
        System.out.println("In sub class");
    }
}
public class Inheritance {
    public static void main(String args[]) {
        Inh i = new Inh();
        Sub s = new Sub();
    }
}
