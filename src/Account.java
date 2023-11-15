import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String message)
    {
        super(message);
    }
}
class Account
{
    int account_no;
    String account_holder_name;
    double balance;
    Account(int no, String name, double balance)
    {
        account_no = no;
        account_holder_name = name;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return account_no;
    }
    public String getAccountHolderName()
    {
        return account_holder_name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setAccountNumber(int actno)
    {
        account_no = actno;
    }
    public void setAccountHolderName(String name)
    {
        account_holder_name = name;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double withdraw(double amount)throws InsufficientBalanceException
    {
        double rem_bal = balance - amount;
        if (rem_bal < 2000)
            throw new InsufficientBalanceException("Withdrawl operation cannot be performed");
        else
        System.out.println(" Withdrawl operation is performed");
        return rem_bal;
    }
    public static void main(String args[])
    {
        Account a = new Account (12345, "Raaji", 250000.0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        Double amount = sc.nextDouble();
        try
        {
            Double bal = a.withdraw(amount);
            System.out.println("Reamining amount="+bal);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
