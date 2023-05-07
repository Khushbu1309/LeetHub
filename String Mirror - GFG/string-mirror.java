//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

//jjfupkravhthvqfbadrkqg
//dbbhbb
//nbgffgbn
//dkgfiwefjsb
//casd
class Solution {
    public static String stringMirror(String str) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(sb.length()==0){
                sb.append(ch);
            }
            else{
                if(sb.charAt(0)>ch && sb.charAt(sb.length()-1)>=ch){
                    sb.append(ch);
                  
                }
               
                else if(sb.charAt(sb.length()-1)<ch){
                    break;
                    
                }
                else{
                    break;
                }
            }
        }
        StringBuilder sb1=new StringBuilder();
        sb1.append(sb);
        sb1.append(sb.reverse());
        return sb1.toString();
        
    }
}
        
