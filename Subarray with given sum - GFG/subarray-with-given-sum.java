//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] nums, int n, int s) 
    {
        // Your code here
        int left=0;
        int right=0;
        ArrayList<Integer> res=new ArrayList<>();
         if(s==0){
            res.add(-1);
            return res;
        }
        
        
        int csum=0;
        while(right<n){
             csum+=nums[right];
             if(csum==s){
                    break;
            }
            
            while(csum>s){
                // if(csum==s){
                //     break;
                // }
                //System.out.println(csum+" "+nums[right]);
                 
                csum-=nums[left++];
               // System.out.println(csum);
                if(csum==s){
                    break;
                }
                
                
            }
            if(csum==s){
                break;
            }
                
            
          
            right++;
        }
        if(right!=n){
            right++;
        }
        if(csum!=s){
            res.add(-1);
            return res;
        }
        
        res.add(left+1);
        res.add(right);
        return res;
        
    }
}
