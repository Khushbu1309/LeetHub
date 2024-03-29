//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static Node modifyTheList(Node head)
    {
        int l=0;
        Node h=head;
         Stack<Integer> st=new Stack<>();
        while(h!=null){
            l++;
            st.push(h.data);
            h=h.next;
        }
        Node th=head;
        if(l%2!=0){
            for(int i=1;i<=l/2;i++){
                th.data=(st.pop()-th.data);
                th=th.next;
                
            }
            st.pop();
            th=th.next;
            while(th!=null){
                th.data=st.pop();
                th=th.next;
                
            }
        }
        else{
            //System.out.println(st);
            // for(int i=1;i<=l/2;i++){
            //     st.pop();
                
            // }
            for(int i=1;i<=l/2;i++){
                th.data=(st.pop()-(th.data));
                th=th.next;
                
            }
             //th=th.next;
             while(th!=null){
                th.data=st.pop();
                th=th.next;
                
            }
            
        }
        return head;
       
       
        

    }
}