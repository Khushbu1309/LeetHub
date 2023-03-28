//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int count=0;
        
        for(int i=0;i<S.length();i++){
             int ucc=0;
                 int lcc=0;
            for(int j=i;j<S.length();j++){
                char ch=S.charAt(j);
               
                if(Character.isUpperCase(ch)){
                    ucc++;
                }
                else{
                    lcc++;
                }
               
                if(lcc==ucc){
                   count++;
                }
            }
        }
        return count;
    }
    // boolean f(String s){
    //     
    //     for(char ch:s.toCharArray()){
           
    //     }
    //     return (lcc==ucc);
    // }
} 
