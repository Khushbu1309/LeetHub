//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        HashMap<Integer,Long>hm=new HashMap<>();
        int[]arr1=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
            
        }
        Arrays.sort(arr);
        long[] res=new long[arr.length];
       
        long count=0;
        
        for(int i=0;i<arr.length;i++){
            
           if(!hm.containsKey(arr[i]))
                hm.put(arr[i],count);
            
           count+=arr[i];
        }
       
        //System.out.println(hm);
        for(int i=0;i<arr1.length;i++){
          
            res[i]=hm.get(arr1[i]);
            
        }
        return res;
        
    }
}