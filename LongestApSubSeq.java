import java.util.HashMap;
import java.util.Scanner;

public class LongestApSubSeq {
    public static int LongestSubsequence(int arr[])
    {
        int l=arr.length;
        int longest=0;
        HashMap<Integer,Integer>[] map=new HashMap[l];
        for(int i=0;i<l;i++)
        {
            
            map[i]=new HashMap<>();
            for(int j=0;j<i;j++)
            {
                int diff=arr[j]-arr[i];
                map[i].put(diff,map[j].getOrDefault(diff,1)+1);
                longest=Math.max(longest,map[i].get(diff));
            }


        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=LongestSubsequence(arr);
        System.out.println(ans);

    }
    
}
