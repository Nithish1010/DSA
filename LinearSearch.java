import java.util.Scanner;
public class LS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]=new int [10];
        System.out.println("Enter how many elements to store: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int target=sc.nextInt();
        int result=ls(A,target);
        if(result!=-1)
        {
             System.out.println("Element "+target+" found at index "+result);
        }
        else
        {
            System.out.println("Element "+target+" not found.");
            System.out.println(result);
        }
    }
    public static int ls(int A[],int target)
    {
        int i;
        for(i=0;i<A.length;i++)
        { 
            if(A[i]==target)
            {
            return i;
            }
        }
    return -1;
    }
}
