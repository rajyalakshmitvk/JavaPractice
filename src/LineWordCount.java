//Example of FileInputStream
import java.io.*;
class LineWordCount
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a file name");
        String fileName=dis.readLine();
        FileInputStream fis=new FileInputStream(fileName);
        //System.out.println("Enter a file name to store output");
        //fileName=dis.readLine();
        //FileOutputStream fos=new FileOutputStream(fileName,true);
        System.out.println(fis.available());
        int k,nw=0,nl=0,nc=0;
        char ch;
        while((k=fis.read())!=-1)
        {
            ch = (char)k;
            if(ch==' '||ch=='\t'||ch=='\n')
                nw++;
            if(ch=='\n')
                nl++;
            nc++;
            //System.out.print((char)k);
            //fos.write(k);
        }
        System.out.println("No. of lines="+nl);
        System.out.println("No. of words="+nw);
        System.out.println("No. of characters="+nc);
        fis.close();
        //fos.close();
    }
}
