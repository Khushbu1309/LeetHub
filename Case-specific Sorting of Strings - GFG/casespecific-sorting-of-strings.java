//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
               sb.append(ch); 
            }
            else{
                sb1.append(ch);
            }
        }
        char[] arr=sb.toString().toCharArray();
        char[] arr1=sb1.toString().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int i=0;
        int j=0;
        
        StringBuilder res=new StringBuilder();
        for(char ch:str.toCharArray()){
             if(Character.isUpperCase(ch)){
               res.append(arr[i++]); 
            }
            else{
                res.append(arr1[j++]); 
            }
            
        }
        return res.toString();
    
        
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    PrintWriter out=new PrintWriter(System.out);
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new Solution().caseSort(str);
    	        out.println(sortedStr);
    	    }
    	    out.close();
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
// } Driver Code Ends