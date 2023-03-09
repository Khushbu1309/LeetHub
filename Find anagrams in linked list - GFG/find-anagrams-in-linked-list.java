//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node((s[0].charAt(0))), tail = head;
        for (int i = 1; i < s.length; i++)
            tail = tail.next = new Node((s[i].charAt(0)));

        return head;
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
        out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            Node head = Node.inputList(br);

            String S = br.readLine().trim();

            Solution obj = new Solution();
            ArrayList<Node> res = obj.findAnagrams(head, S);

            for (Node node : res) {
                Node temp = node;
                Node.printList(temp, out);
            }
            if (res.size() == 0) {
                out.println("-1");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
/*

Definition for singly Link List Node
class Node
{
    char data;
    Node next;

    Node(char x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        ArrayList<Node> res=new ArrayList<>();
        int[] sfreq=new int[26];
        int[] winfreq=new int[26];
        Node h=head;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sfreq[ch-'a']++;
            
        }
        int count=0;
        Node l=head;
        Node r=head;
        int n=s.length();
     
        while(r!=null){
            char ch=r.data;
            count++;
            winfreq[ch-'a']++;
            
            if(count==n){
                if(Arrays.equals(sfreq,winfreq)){
                    Node next=r.next;
                    r.next=null;
                    res.add(l);
                    r=next;
                    l=r;
                    count=0;
                    Arrays.fill(winfreq,0);
                    
                    
                }
                else{
                    winfreq[l.data-'a']--;
                    l=l.next;
                    r=r.next;
                    count--;
                    
                }
                
            }
            else{
                r=r.next;
                
            }
            
        }
        return res;
           
       
    }
}