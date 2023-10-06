//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
        Node oddlist=new Node(0);
        Node cn=oddlist;
        Node revn=odd.next;
        if(odd==null || odd.next==null){
            return ;
        }
        Node fast=odd;
        // Node slow=odd.
        while(fast!=null && fast.next!=null){
            
            
            Node nn=new Node(fast.next.data);
            cn.next=nn;
            cn=cn.next;
            
            fast.next=fast.next.next;
            fast=fast.next;
            
        }
          
          Node  nrn=f(oddlist.next,null);
          fast=odd;
         while(fast.next!=null){
             fast=fast.next;
             
         }
         fast.next=nrn;
        
        
    }
    
    
     public static Node f(Node  head,Node  prev){
        if(head==null){
            return prev;
        }
        Node nn=head.next;
        head.next=prev;
        prev=head;
       

        return f(nn,prev);


    }
}
