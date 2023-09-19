public class ThisExample {
    String msg;
    public ThisExample(String m) {
        this.msg = m;
        System.out.println(this+" "+m);
    }
    public static void main(String[] args) {
        ThisExample t = new ThisExample("Hello");
        System.out.println(t+" "+t.msg);
    }
}
