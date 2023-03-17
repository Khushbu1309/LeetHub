//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] arr = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i= 0; i < N; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution obj = new Solution();
			System.out.println(obj.no_of_subarrays(N, arr));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	long no_of_subarrays(int N, int [] arr) {
		//Write your code here
		long  count=0;
		long ans=0;
		for(int i=0;i<arr.length;i++){
		    
		       if(arr[i]==0){
		           count++;
		       }else{
		           ans+=(count+1)*count/2;
		           count=0;
		           
		       }
		    
		    
		}
		ans+=(count+1)*count/2;
		return ans;
		
		
	}
}