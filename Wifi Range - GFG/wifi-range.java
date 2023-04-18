//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        boolean[] rooms=new boolean[N];
        // code here
        if(X==0 && N!=0){
            return false;
        }
        if(X==0 && N==0){
            return true;
        }
      
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='1'){
                rooms[i]=true;
                int l=(i-X);
                if(l>=0){
                     while(l<i ){
                        rooms[l++]=true;  
                    } 
                }
                 if(l<0){
                    l=0;
                    while(l<i ){
                        rooms[l++]=true;  
                    }
                    
                }
               
                int r=(i+X);
                if(r<N){
                     while(r>i ){
                        rooms[r--]=true;  
                    }
                    
                }
                if(r>=N){
                    r=N-1;
                    while(r>i ){
                        rooms[r--]=true;  
                    }
                    
                }
            }
           
           
           
            
        }
        
        for(boolean i:rooms){
            //System.out.println(i+" ");
            if(i==false){
                return false;
            }
        }
        return true;
    }
} 



