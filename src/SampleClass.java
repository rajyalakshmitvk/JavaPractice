class TestClass {
    int x,y;
    String name;
    public void display() {
        System.out.println(this+" "+" Hi "+x+ " "+y+ "Name="+name);
    }
}
public class SampleClass {
    public static void main(String[] args) {
        System.out.println("Classes and Objects");
        int h;
        TestClass t = new TestClass();
        System.out.println(t+" "+t.x+" "+t.y+" "+t.name);
        //x=25;
        t.x=10;
        t.y=20;
        t.display();
        TestClass t1 = t;
        t1.x=35;
        t1.display();
        t.display();
        TestClass t2 = new TestClass();
        t2.display();
        System.out.println(t+" "+t1+ " "+ t2);
    }
}
