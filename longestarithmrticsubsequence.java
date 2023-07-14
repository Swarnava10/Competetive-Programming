import java.util.HashMap;
import java.util.Scanner;

public class longestarithmrticsubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        int l=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<l;i++)
        {
            if(map.containsKey(arr[i]-difference))
                map.put(arr[i],map.get(arr[i]-difference)+1);
            else
                map.put(arr[i],1);
            
            max=Math.max(max,map.get(arr[i]));
        }
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Enter the array size and the array:");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        longestarithmrticsubsequence ob=new longestarithmrticsubsequence();
        int ans=ob.longestSubsequence(arr, n);
        System.out.println("the longest subsequence is : "+ans);
    }
}

