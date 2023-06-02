//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] s1, int[] s2, int[] s3) {
        // code here
        int s1sum=0;
        int s2sum=0;
        int s3sum=0;
        for(int i:s1){
            s1sum+=i;
        }
        for(int i:s2){
            s2sum+=i;
        }
        for(int i:s3){
            s3sum+=i;
        }
        int i=0;
        
        int j=0;
        
        int k=0;
        while(i<s1.length || j<s2.length || k<s3.length){
            if(s1sum==s2sum && s2sum==s3sum){
                return s1sum;
            }
            else if( i<s1.length && (s1sum>s2sum || s1sum>s3sum)){
                s1sum-=s1[i];
                i++;
                
            }
            else if(j<s2.length && s2sum>s1sum || s2sum>s3sum){
                s2sum-=s2[j];
                j++;
                
            }
            else if(k<s3.length && s3sum>s2sum || s3sum>s1sum){
                s3sum-=s3[k];
                k++;
                
            }
        }
        return 0;
        
        
    }
}
        
