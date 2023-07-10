import java.util.*;

public class majorityele {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      int ans=  majority(arr, n);
      System.out.println("The majority ele is :" +ans);
    }

    public static int majority(int arr[],int n)
    {
        int count=1;
        int val=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]==val)
            {
                count++;
            }
            else
            {
                count--;
                if(count==0)
                {
                val=arr[i];
                count=1;
                }
            }
        }   
        return val;
    }
}
