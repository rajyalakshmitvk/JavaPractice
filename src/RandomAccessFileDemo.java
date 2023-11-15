import java.io.*;
class RandomAccessFileDemo {
    public static void main(String[] args) {

        try {
            // create a new RandomAccessFile with filename test
            String filename;
            DataInputStream dis=new DataInputStream(System.in);
            System.out.println("Enter filename");
            filename=dis.readLine();
            RandomAccessFile raf = new RandomAccessFile(filename, "rw");
            // write something in the file
            raf.writeUTF("Hello World");
            // set the file pointer at 0 position
            raf.seek(0);
            // print the string
            System.out.println("" + raf.readUTF());
            // set the file pointer at 5 position
            raf.seek(5);
            // write something in the file
            raf.writeUTF("This is an example");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}