/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        ListNode current = head;
        ListNode post = head.next;
        
        while(post != null) {
        	current.next = post.next;
        	post.next = head;
        	head = post;
        	post = current.next;
        }
        
        return head;
    }
}
