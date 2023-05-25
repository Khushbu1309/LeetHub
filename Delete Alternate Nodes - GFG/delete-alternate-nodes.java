//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}

class GFG {
    	

    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    Node head1 = null,tail1 = null;
		    
		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();		    
		    head1 = new Node(d1);
		    tail1 = head1;
		    
		    while(n1-- > 1){
		        tail1.next = new Node(sc.nextInt());
		        tail1 = tail1.next;
		    }
		    
		    Solution obj = new Solution();
		    obj.deleteAlternate(head1);
		    while(head1 != null){
		        System.out.print(head1.data + " ");
		        head1 = head1.next;
		    }
		    System.out.println();
		}
	}

}


// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
5
36 10 40 5 50

*/
class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        int l=0;
        Node th=head;
        while(th!=null ){
           l++;
           th=th.next;
           
        }
        
        
        if(l%2==0){
            Node h=head;
            while(h!=null ){
                h.next=h.next.next;
                h=h.next;
                if(  h.next.next==null || h.next==null){
                    h.next=null;
                    return ;
                }
            }
            
        }
        else{
            Node h=head;
            while(h.next!=null ){
                h.next=h.next.next;
                h=h.next;
                
                
                // if(  h.next.next==null ){
                //     h.next=null;
                //     return ;
                // }
                
            }
                
        }
    
    }
}