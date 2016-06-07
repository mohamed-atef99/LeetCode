/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public ListNode deleteDuplicates(ListNode head) 
	{
	    ListNode Current=head;
		while(Current!=null)
		{
		   ListNode Next=Current.next;
		   while(Next!=null&&Current.val==Next.val)
		   {
		      Current.next=Next.next;
			  Next=Current.next;
		   }
		   Current=Current.next;
		}
	    return head;    
	}
}