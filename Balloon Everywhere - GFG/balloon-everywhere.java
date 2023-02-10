//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            max=Math.max(max,hm.get(ch));
           
        }
        
        int count=0;
        while(max>0){
            if(hm.get('b')>0 && hm.get('a')>0 && hm.get('l')>1 && hm.get('o')>1 && hm.get('n')>0){
                count++;
                 hm.put('a',hm.get('a')-1);
                 hm.put('b',hm.get('b')-1);
                 hm.put('l',hm.get('l')-2);
                 hm.put('o',hm.get('o')-2);
                 hm.put('n',hm.get('n')-1);
                 
                 
                
            }
            max--;
        }
        return count;
    }
   

}