//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}
// } Driver Code Ends


/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    HashSet<Integer> hs=new HashSet<>();
	      Node prev=head;
	    Node th=head;
	    Node nh=new Node(0);
	    Node c=nh;
	    
	    while(th!=null){
	        if(!hs.contains(th.data)){
	             hs.add(th.data);
	            Node nn=new Node(th.data);
	            c.next=nn;
	            c=c.next;
	             th=th.next;
	            
	           // hs.add(th.data);
	           // prev=th;
	           // th=th.next;
	            
	        }
	        else{
	           // prev.next=th.next;
	           // prev=th;
	            th=th.next;
	        }
	    }
	    
	    
	    
	   // int prev=-1;
	  
	   // while(th!=null){
	   //     if(prev==-1){
	   //         prev=th.data;
	   //         th=th.next;
	   //     }
	   //     else{
	   //         if(prev==th.data){
	   //             p.next=th.next;
	   //             prev=th.data;
	   //             p=th;
	   //             th=th.next;
	                
	   //         }
	   //         else{
	   //             prev=th.data;
	   //             p=th;
	   //             th=th.next;
	   //         }
	   //     }
	        
	    
	    return nh.next;
    }
}
// 5
// 2 2 2 2 2