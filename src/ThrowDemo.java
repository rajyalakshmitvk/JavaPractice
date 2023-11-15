public class ThrowDemo {
    static void divide(int a){
        int b = a/ (a-a);
        throw new ArithmeticException("Divide by zero exception");
        //System.out.println("a="+a);
    }
    public static void main(String[] args){
        try
        {
            divide(20);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
