public class Constructor {
    int a;
    public Constructor(String ab, int av)
    {
        a = av ;
        System.out.println("a="+a+ " Message1="+ab);
    }
    public Constructor( int aval, String abc) {
        a = aval;
        System.out.println("a="+a+ " Message2="+abc);
    }
    public static void main(String[] args) {
        Constructor c = new Constructor("Hello",25);
        Constructor c1 = new Constructor(25,"Pollo");
    }
}
