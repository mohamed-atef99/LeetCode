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
         return head;

      ListNode previous=null;
      ListNode next=head;
      while(next!=null)
      {
          next=head.next;
          head.next=previous;
          previous=head;
          if(next!=null)
          head=next;
      }
      return head;
    }
}