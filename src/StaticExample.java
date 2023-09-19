public class StaticExample {
    static int a,b;
    int c,d;
    public static void main(String[] args){
        System.out.println(a+" "+b);
        StaticExample s = new StaticExample();
        s.c=20;s.d=25;s.a=10;s.b=30;
        System.out.println(s.c+" "+s.d+" "+s.a+" "+s.b);
        StaticExample s1 = new StaticExample();
        s1.c=21;s1.d=22;s1.a=25;
        StaticExample s2 = new StaticExample();
        System.out.println(s1.c+" "+s1.d+" "+s.a+" "+s1.a+" "+s2.a+" "+s1.b);
        /*StaticExample s2 = new StaticExample();
        s2.c=20;s2.d=25;
        System.out.println(s2.c+" "+s2.d+" "+s2.a+" "+s2.b);
        StaticExample s3=new StaticExample();
        System.out.println(s3.a+" "+s3.b);*/
    }
}
