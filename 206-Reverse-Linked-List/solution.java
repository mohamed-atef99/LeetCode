/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public ListNode reverseList(ListNode head) 
	 {
	     if(head==null)
	    	 return null;
	     ListNode returnednode=reverseList(head.next);
	     if(returnednode==null)
	     {
	    	 returnednode=head;
	    	 return returnednode;
	     }
	     ListNode next=head.next;
	     head.next=null;
	     next.next=head;

	     return returnednode;
	 } 	
}