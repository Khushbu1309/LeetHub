//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String s)
    {
        // your code here
        Stack<String> st=new Stack<>();
        StringBuilder sb1=new StringBuilder();
        for(char ch:s.toCharArray()){
            
            if(ch=='+' || ch=='-' || ch=='/' || ch=='*'){
                 st.push(sb1.toString());
                st.push(Character.toString(ch));
                sb1.delete(0,sb1.length());
               
            }
            else{
                 sb1.append(ch);
                // System.out.println(sb1);  
            }
            
            
        }
        if(sb1.length()>0){
            st.push(sb1.toString());
        }
        //System.out.println(st);
        
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}