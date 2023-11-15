@FunctionalInterface
interface MyInterface {
    String reverse(String n);
}
@FunctionalInterface
interface MyInterface1 {
    int square(int num);
}
public class LambdaReverseTest {
    public static void main( String[] args ) {
        MyInterface myInterface = (str) -> { // Lambda Expression
            String result = "";
            for(int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("The reverse of string is: " + myInterface.reverse("Rajyalakshmi"));
        MyInterface1 myInterface2 = (num) -> { // Lambda Expression
            return num*num;
        };
        System.out.println("The square of given number is: " + myInterface2.square(5));
    }
}