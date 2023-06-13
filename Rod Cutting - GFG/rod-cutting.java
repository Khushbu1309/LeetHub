//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int[][] dp=new int[price.length][n+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return f(n,n-1,price,dp);
    }
    int f(int n,int ind,int[] price,int[][] dp){
        if(ind==0){
            if(n>=0){
                return (n)*price[ind];
            } 
            else{
                return 0;
            }
        }
        
        if(dp[ind][n]!=-1){
            return dp[ind][n];
        }
        int nottake=f(n,ind-1,price,dp);
        int length=ind+1;
        int take=Integer.MIN_VALUE;
        if(length<=n){
             take=price[ind]+f(n-length,ind,price,dp);
        }
        return dp[ind][n]=Math.max(take,nottake);
        
        
    }
}