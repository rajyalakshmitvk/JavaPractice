package Training;

import java.util.Scanner;
public class BinSrchDAC {
    public int binSrchWithoutRecursion(int a[],int low, int n, int search)
    {
      int high=n,mid = (low+high)/2;
      int pos=-1;
      while(low<high) {
          if (a[mid] < search)
              low = mid + 1;
          else if (a[mid] > search)
              high = mid - 1;
          else {
              pos = mid;
              break;
          }
        }
        return pos;
    }
    public int binSrchWithRecursion(int a[],int low, int high,int search)
    {
        if (high >= low && low <= a.length - 1) {

            int mid = low + (high - low) / 2;

            if (a[mid] == search)
                return mid;
            if (a[mid] > search)
                return binSrchWithRecursion(a, low, mid - 1, search);

            return binSrchWithRecursion(a, mid + 1, high, search);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        BinSrchDAC b = new BinSrchDAC();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        int search = sc.nextInt();
        int pos1=b.binSrchWithoutRecursion(a,0,n,search);
        int pos2=b.binSrchWithRecursion(a,0, n,search);
        System.out.println(pos1+" "+pos2);
    }
}
