import java.util.*;
class StringHandling
{
    public static void main(String args[])
    {
        String s = new String("VVIT College");
        char a[]={'a','b','c','d','e','f'};
        String s1 = new String(a);
        String s2 = new String(a,2, 3);
        String s3 = new String(s);
        byte b[]={65,66,67,68,69,70};
        String s4 = new String(b);
        String s5 = new String(b,1,3);
        System.out.println(s.length());
        System.out.println(Integer.valueOf(123));
        Integer i = new Integer(5);
        System.out.println(i.toString());
        System.out.println(s.charAt(5));
        char[] c = new char[10];
        for(char ch:s.toCharArray())
            System.out.println(ch);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s3));
        String s6 = s.toUpperCase();
        System.out.println(s.equalsIgnoreCase(s6));
        System.out.println(s1.regionMatches(2,s2,0,3));
        System.out.println(s1.startsWith("ab"));
        System.out.println(s1.endsWith("ef"));
        System.out.println(s1.equals(s));
        System.out.println(s==s3);
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.indexOf('b'));
        System.out.println(s1.lastIndexOf('b'));
        System.out.println(s1.indexOf(65));
        System.out.println(s1.lastIndexOf("ef"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.concat("ghijk"));
        System.out.println(s.replace('e','a'));
        System.out.println(s.replace("vit","iva"));
        String s7=String.join(":","Welcome","to","vvit");
        System.out.println(s7);//static method
        System.out.println(s1.replaceFirst("ab","cd"));
        System.out.println(s.replaceAll("e","a"));
        String st[] = s7.split(":");
        for(String it:st)
            System.out.println(it);
        String st1[] = s7.split(":",3);
        for(String it:st1)
            System.out.println(it);
        System.out.println(s1.regionMatches(false,2,s2.toUpperCase(),0,3));
    }
}