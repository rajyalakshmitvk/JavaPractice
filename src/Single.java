class Inh1 {
    int i,j;
    public Inh1() {
        System.out.println("Hello");
    } }
class Sub1 extends Inh1 {
    int i,j,k;
    public Sub1()  {
        System.out.println("In sub class");
    }}
public class Single {
    public static void main(String args[]) {
        Inh1 i1 = new Inh1();
        Sub1 s = new Sub1();
        Sub1 s1 = new Sub1();
        s.i=10;
        //s.j=20;//Throws Error
        s.k=30;
        //System.out.println("From Subclass\n" +
        //        "i="+s.i+" j="+s.j+" k="+s.k);
        //Throws error as j is private
        //System.out.println("From Super class\ni="
        //        +i1.i+"j="+i1.j);
        //Throws error as j is private
        }
}
