/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head)
    {
           if(head!=null)
	        {
	          ListNode currentNode =head;
	          ListNode previous=null;
	          ListNode temp=null;
	          while(currentNode!=null)
	          {
	              temp=currentNode.next;
	              currentNode.next=previous;
	              previous=currentNode;
	              currentNode=temp;
	              if(currentNode==head)
	                return true;
	          }
	          return false;
	        } 
	        else
	        return false;
    }
}