//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> res=new ArrayList<>();
        
        for(String s:Dictionary){
             StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
               
                if(Character.isUpperCase(s.charAt(i))){
                    sb.append(s.charAt(i));
                    //System.out.println(sb);
                    if(Pattern.equals(sb.toString())){
                        res.add(s);
                        // break;
                    }
                    
                    
                }
                
            }
        }
        if(res.size()==0){
            res.add("-1");
            return res;
        }
        Collections.sort(res);
        return res;
    }
}