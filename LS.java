import java.util.Scanner;
public class LS
{
    public static void main(String args[])
    {
        int A[]=new int[15];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements to store: ");
        n=sc.nextInt();
        System.out.println("Enter Array elements: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter th element to search: ");
        int target=sc.nextInt();
        int result=ls(A,target);
        if(result!=0)
        {
            System.out.println("Element "+target+" found at index "+result);
        }
        else
        {
            System.out.println("Element not found"+result);
        }
    }
    public static int ls(int A[],int target)
    {
        int i=0;
        for(i=0;i<A.length;i++)
        {
            if (A[i]==target)
            {
                return i;
            }
        }
        return -i;
    }
}