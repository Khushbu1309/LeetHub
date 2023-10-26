//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperation(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minOperation(int n)
    {
        //code here.
       int ops=0;
         while(n>0){
             if(n%2==0) n/=2;
             else n-=1;
             ops++;
         }
         return ops ;
    }
    // public int f(int i,int n,int step){
    //      if(i==n){
    //         return step;
    //     }
        
       
    //     if(i>n){
    //          return (int)Math.pow(10,9);
    //     }
       
    //     int fs=f(i+1,n,step+1);
    //     int ss=f(i*i,n,step+1);
    //     return Math.min(fs,ss);
    // }
}