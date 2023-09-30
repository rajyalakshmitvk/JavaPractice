public class Overload {
    public void test() {
        System.out.println("NO parameters");
    }
    public void test(int a) {
        System.out.println("one parameter" + a);
    }
    public void test(int a, String r) {
        System.out.println("different params");
    }
    public void test(String r, int a) {
        System.out.println("different params and order changed");
    }

    public static void main(String[] args) {
        Overload o=new Overload();
        o.test();
        o.test(10);
        o.test(10,"Hello");
        o.test("hello",50);
    }
}
