import java.io.*;
class FileOutputOperations1
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a file name");
        String fileName=dis.readLine();
        FileInputStream fis=new FileInputStream(fileName);
        System.out.println("Enter a file name to store output");
        fileName=dis.readLine();
        FileOutputStream fos=new FileOutputStream(fileName);
        System.out.println(fis.available());
        int k;
        while((k=fis.read())!=-1)
        {
              fos.write(k);
        }
        fis.close();
        fos.close();
    }
}