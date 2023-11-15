package Training;
import java.util.*;
class MergeSort {
    static void mergeSort(int a[],int low, int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    static void merge(int a[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=low;
        int b[]=new int[high+1];
        while(i<=mid && j<=high)
        {
            if(a[i]<=a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];
        }
        while(j<=high)
            b[k++]=a[j++];
        while(i<=mid)
            b[k++]=a[i++];
        for(int h=low;h<=high;h++)
            a[h]=b[h];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Elements of array before sorting");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        mergeSort(a,0,a.length-1);
        System.out.println("Elements of array after sorting");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

