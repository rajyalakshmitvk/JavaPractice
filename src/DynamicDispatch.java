abstract class Figure
{
    abstract void area();
    abstract void perimeter();
    public void display(){
        System.out.println("Hello this is " +
                "not abstract method");
    }
}
class Triangle extends Figure
{
    Triangle()
    {
        System.out.println("\nTriangle");
    }
    void area()
    {
        System.out.println("Area=1/2*length*breadth");
    }
    void perimeter()
    {
        System.out.println("Perimeter=side1+side2+side3");
    }
}
class Rectangle extends Figure
{
    Rectangle()
    {
        System.out.println("\nRectangle");
    }
    void area()
    {
        System.out.println("Area=length*breadth");
    }
    void perimeter()
    {
        System.out.println("Perimeter=2*(length+breadth)");
    }
}
class Square extends Figure
{
    Square()
    {
        System.out.println("\nSquare");
    }
    void area()
    {
        System.out.println("Area=side*side");
    }
    void perimeter()
    {
        System.out.println("Perimeter=4*side");
    }
}
public class DynamicDispatch
{
    public static void main(String args[])
    {
        Figure f;//= new Figure();
        Triangle t=new Triangle();
        f=t;
        f.area();
        f.perimeter();
        f.display();
        Rectangle r=new Rectangle();
        f=r;
        f.area();
        f.perimeter();
        f.display();
        Square s=new Square();
        f=s;
        f.area();
        f.perimeter();
        f.display();
    }
}