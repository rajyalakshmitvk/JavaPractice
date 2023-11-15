//assert expression;
//assert expression1:expression2:


import java.util.Scanner;

class AssertExample{
    public static void main( String args[] ){

        Scanner scanner = new Scanner( System.in );
        System.out.print("Enter ur age ");

        int value = scanner.nextInt();
        assert value>=18:" Not valid";

       // System.out.println("value is "+value);
    }
}  