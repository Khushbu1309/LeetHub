//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node thead=head1;
        Node prev=null;
         Node newnode=new Node(key);
        if(head1==null){
            return head1;
        }
        if(head1.data>=key){
           
            newnode.next=head1;
            head1=newnode;
             return head1;
        }
        
        while(thead!=null   ){
            prev=thead;
            thead=thead.next;
            if(prev.next==null){
               
                prev.next=newnode;
                newnode.next=null;
                 return head1;
                
            }
            else  if(thead.data>=key){
               
                prev.next=newnode;
                newnode.next=thead;
                 return head1;
               
            }
                
        }
        return head1;
        
         
        
        
    }
}