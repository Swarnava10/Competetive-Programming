import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=MaxSum(arr,n);
        System.out.println(max);

    }

    public static int MaxSum(int arr[],int n)
    {
        int currsum=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            currsum+=arr[i];
            max=Math.max(max,currsum);
            if(currsum<0)
            currsum=0;
        }
        return max;
    }

    
}
