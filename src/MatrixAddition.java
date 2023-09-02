import java.util.Scanner;
class MatrixAddition
{
    public static void main(String args[])
    {
        int m,n,p,q;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions " +
                "of first matrix");
        System.out.println("Enter rows of A");
        m=sc.nextInt();
        System.out.println("Enter columns of A");
        n=sc.nextInt();
        System.out.println("Enter dimensions of " +
                "second matrix");
        System.out.println("Enter rows of B");
        p=sc.nextInt();
        System.out.println("Enter columns of B");
        q=sc.nextInt();
        if(m==p && n==q)
        {
            System.out.println("Addition of A and B is possible");
            int A[][]=new int[m][n];
            int B[][]=new int[p][q];
            System.out.println("Enter elements of A:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println("Enter A["+i+"]["+j+"] value");
                    A[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of B:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println("Enter B["+i+"]["+j+"] value");
                    B[i][j] = sc.nextInt();
                }
            }
            int C[][]=new int[m][n];
            System.out.println("Enter elements of C are:");
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    C[i][j] = A[i][j]+B[i][j];
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Matrix Addition is not possible");
    }
}