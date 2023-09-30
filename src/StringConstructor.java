public class StringConstructor {
    public static void main(String[] args) {
        String s = new String();
        String s1 = new String(s);
        char c[]= {'a','b','c','d','e',' '};
        String s2 = new String(c);
        String s3 = new String(c,2,2);
        byte b[]={65,66,67,68,69,70};
        String s4 = new String(b);
        String s5 = new String(b,2,2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
