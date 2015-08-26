public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        
        int len = len(head);
        k = k % len;
                
        if(k == 0) return head;

        ListNode newHead = getNewHead(head, k, len);
        
        joinTwoParts(newHead, head);
        
        return newHead;
    }
    
    public int len(ListNode head) {
    	ListNode current = head;
    	int len = 0;
    	
    	while(current != null) {
    		len++;
    		current = current.next;
    	}
    	
    	return len;
    }
    
    public ListNode getNewHead(ListNode head, int k, int len) {
    	ListNode current = head;
        for(int i = 1; i < len-k; i++) {
        	current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
        
        return newHead;
    }
    
    public void joinTwoParts(ListNode newHead, ListNode head) {
    	ListNode current = newHead;
    	while(current.next != null) {
    		current = current.next;
        }
    	current.next = head;
    }
}
