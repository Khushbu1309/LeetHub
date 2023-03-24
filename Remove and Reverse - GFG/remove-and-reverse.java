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
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    String removeReverse(String S) 
    {
        // StringBuilder sb=new StringBuilder(S);
        // HashSet<Character> hs=new HashSet<>();
        // for(int i=0;i<sb.length();i++){
        //     String ch=sb.substring(i,i+1);
        //     char ch1=sb.charAt(i);
        //     sb.deleteCharAt(i);
        //     if(sb.toString().contains(ch)){
        //          sb.reverse();
        //          i--;
        //     }
        //     else{
        //         sb.insert(i,ch1);
                
        //     }
        // }
        // return sb.toString();
        
        
        HashMap<Character,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(char ch:S.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int left=0;
        int right=S.length()-1;
        boolean rev=false;
        while(left<right){
            if(!rev){
                char ch=S.charAt(left);
                if(hm.get(ch)>1){
                    hm.put(ch,hm.get(ch)-1);
                    hs.add(left);
                    rev=!rev;
                    
                }
                left++;
            }
            else{
                 char ch=S.charAt(right);
                if(hm.get(ch)>1){
                    hm.put(ch,hm.get(ch)-1);
                    hs.add(right);
                    rev=!rev;
                    
                }
                right--;
                
            }
            
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!hs.contains(i)) res.append(S.charAt(i));
        }
        if(rev) 
            return res.reverse().toString();
        return res.toString();
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends