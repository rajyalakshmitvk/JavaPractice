import java.io.*;

class StringBufferHandling {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.insert(1, "Java");
        System.out.println(sb);
        sb.replace(1, 3, "Java");
        System.out.println(sb);
        sb.delete(1, 3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
    }
}