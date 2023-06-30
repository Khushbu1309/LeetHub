//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
        int count=0;
        while(N>0){
            int r=N%2;
            N=N/2;
            //System.out.println(N+" "+r);
            if(r==1){
                count++;
            }
        }
        return count;
        
    }
}
// 6/2=3 0
// 3/2