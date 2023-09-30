public interface FirstInterface {
        final public int a=10;
        public void display();
        public void hello();
}
interface SecondInterface {
    public void welcome();
}
class A implements FirstInterface, SecondInterface
{
    public void display(){}
    public void hello(){}
    public void welcome(){}
}


