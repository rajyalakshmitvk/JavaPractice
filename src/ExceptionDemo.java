import java.util.Scanner;
class InvalidAgeException extends Exception
{
    InvalidAgeException(String message)
    {
        super(message);
    }
}
public class ExceptionDemo
{
    int age;
    ExceptionDemo (int age)
    {
        this.age =age;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ageValue = sc.nextInt();
        ExceptionDemo m=new ExceptionDemo(ageValue);
        if(m.age>18)
        {
            try{
                throw new InvalidAgeException("Age should be greater than 18");
            }
            catch(InvalidAgeException e) {
                System.out.println(e.getMessage());
            }}
                  else
            System.out.println("Welcome! You are eligible for voting");
        }
    }
