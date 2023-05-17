/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       /* int count=0;
        ListNode th=head;
        while(th!=null){
            count++;
            th=th.next;
        }
        int ei=count-k;
        ListNode thnode=head;
         ListNode fprevnode=head;
          ListNode fnextnode=head;
           ListNode bnextnode=head;
         
          ListNode bprevnode=head;
        for(int i=1;i<count;i++){
            if(i<k){
                fprevnode=thnode;
                fnextnode=fprevnode.next;
            }
            if(i<ei){
                bprevnode=thnode;
                bnextnode=bprevnode.nex;
            }
        }
        fprevnode.next=bprevnode.next;
        fprevnode.next=fnextnode;
        
        bprevnode.next.next=fnextnode;*/


        // fprevnode.next.val=bprevnode.next.val;
         if(head==null ){
            return head;
        }
        int count=0;
        ListNode h=head;
        while(h!=null){
            count++;
            h=h.next;
        }
     
        ListNode th=head;
        ListNode th1=head;
        for(int i=1;i<k;i++){
            th=th.next;
        }
        for(int i=1;i<=(count-k);i++){
            th1=th1.next;
        }
       
        int temp=th.val;
        th.val=th1.val;
        th1.val=temp;
        return head; 
        
              


        
    }
}