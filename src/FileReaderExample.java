import java.io.FileReader;
import java.util.Scanner;
class FileReaderExample {
    public static void main(String[] args) {
        // Creates an array of character
        char[] array = new char[100];
        try {
            // Creates a reader using the FileReader
            Scanner sc= new Scanner(System.in);
            String fileName = sc.nextLine();
            FileReader input = new FileReader(fileName);
            // Reads characters
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            // Closes the reader
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}