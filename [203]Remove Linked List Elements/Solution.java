/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        
        ListNode current = newHead;
        ListNode post = head;
        
        while(post != null) {
        	if(post.val == val) {
        		current.next = post.next;
        		post = current.next;
        	}
        	else {
        	    current = current.next;
        	    post = post.next;
        	}
        }
        
        return newHead.next;
    }
}
