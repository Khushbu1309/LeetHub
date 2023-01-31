//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
     
      Solution obj = new Solution();
      boolean ans = obj.checkSubsequenceSum(n,a,k);
      System.out.println(ans?"Yes":"No");
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
    // code here
    return f(0,arr,K,0);

  }
  static boolean  f(int ind,int[] arr,int tar,int csum){
      if(csum>tar){
          return false;
      }
      if(ind==arr.length){
          if(csum==tar){
             return true;
          }
          return false;
      }
     
      boolean ans=(f(ind+1,arr,tar,csum+arr[ind]) || f(ind+1,arr,tar,csum));
      return ans;
  }
}
     