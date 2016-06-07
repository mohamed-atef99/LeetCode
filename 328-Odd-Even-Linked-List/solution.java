/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public  ListNode oddEvenList(ListNode head)
	    {
	        if(head==null)
	         return head;
	        ListNode odd=head;
	        ListNode even=head.next;
            ListNode temp=null;
            
            while(even!=null&&even.next!=null)
            {
                temp=odd.next;
                
                odd.next=even.next;
                even.next=even.next.next;
                odd.next.next=temp;
                
                odd=odd.next;
                even=even.next;
            }
            
	        return head; 
	    }
}