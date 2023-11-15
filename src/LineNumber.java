//Example of FileInputStream
import java.io.*;
class LineNumber
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a file name");
        String fileName=dis.readLine();
        FileInputStream fis=new FileInputStream(fileName);
        int k,nl=0;
        char ch;
        System.out.print((++nl)+".");
        while((k=fis.read())!=-1)
        {
            ch = (char)k;
            System.out.print(ch);
            if(ch=='\n') {
                System.out.print((++nl) + ".");
            }
        }
        fis.close();
    }
}
