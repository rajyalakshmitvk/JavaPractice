public class ThrowException {
    public static void main(String[] args){
        try
        {
            int a = Integer.parseInt(args[0]);
            throw new ArrayIndexOutOfBoundsException("Invalid arg");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
