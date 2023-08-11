//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int n, int amount) {
        // code here.
        long[][] dp=new long[coins.length][amount+1];
        for(long[] i:dp)
            Arrays.fill(i,-1);
        return f(0,amount,coins,dp);
      
        
    }
    long f(int i,int amount, int[] coins,long[][] dp){
        if(i==(coins.length-1)){
            if(amount%coins[i]==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        long pick=0;
        if(coins[i]<=amount){
            pick=f(i,amount-coins[i],coins,dp);
        }
        long notpick=f(i+1,amount,coins,dp);
        return dp[i][amount]=(pick+notpick);

    }
}