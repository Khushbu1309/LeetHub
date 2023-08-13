//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        int[] dp=new int[n+2];
        
         
         dp[0]=0%1000000007;
         dp[1]=1%1000000007;
         
         for(int i=2;i<=n;i++){
             dp[i]=dp[i-1]%1000000007+dp[i-2]%1000000007;
             //System.out.println(dp[i]+" ");
         }
        return dp[n]%1000000007;
        
        
        
        // int a = 0, b = 1, c;
        // if (n == 0)
        //     return a;
        // for (int i = 2; i <= n; i++) {
        //     c = (a + b)%1000000007;
        //     a = b%1000000007;
        //     b = c%1000000007;
        // }
        // return b;
        
    }
    // public static int f(int i,int[] dp){
    //     if(i==0 || i==1){
    //         return i;
    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     return dp[i]= (f(i-1,dp)+f(i-2,dp));
    // }
}