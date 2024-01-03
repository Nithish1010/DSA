import java.util.Scanner;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements to store: ");
        int n=sc.nextInt();
        int A[]=new int[10];
        System.out.println("Enter elements to store: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter elements to search: ");
        int target=sc.nextInt();
        int result=bs(A,target);
        if(result!=-1)
        {
            System.out.println("\nElement "+target+" found at index"+result);
        }
        else
        {
            System.out.println("\nElement "+target+" not found");
            System.out.println("\n"+result);
        }
    }
    public static int bs(int[] A,int target)
    {
       int left=0;
       int right=A.length-1;
       while(left<=right)
       {
            int mid=(left+right)/2;
            if(A[mid]==target)
            {
                return mid;
            }
            else if(A[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
       }
       return-1;
    }
}
