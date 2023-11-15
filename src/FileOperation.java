import java.io.*;
class FileOperation
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter a file name");
        String str= dis.readLine();
        File f = new File(str);
        if(f.exists())
        {
            System.out.println("File exists in the directory");
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
            System.out.println(f.getParent());
            System.out.println(f.canRead()?"Readable":"Unreadable");
            System.out.println(f.canWrite()?"Writable":"UnWritable");
            System.out.println(f.isDirectory()?"Directory":"Not a directory");
            System.out.println(f.isFile()?"File":"Not a file");
            System.out.println(f.isAbsolute()?"Absolute path":"Not absolute path");
            System.out.println(f.lastModified());
            System.out.println(f.length());
            System.out.println(f.isHidden()?"File is hidden":"Not a hidden file");
            System.out.println(f.renameTo(new File("Unchecked1.java")));
        }
        else
            System.out.println("File does not exist");
    }
}