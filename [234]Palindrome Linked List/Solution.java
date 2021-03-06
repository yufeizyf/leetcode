/*
class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true; 
 	
	//1.find the middle of list       
        ListNode mid = findMid(head);
	
	//2.reverse the right part of list
        ListNode right = reverseRightPart(mid.next);   
        ListNode left = head;
        
	//3.compare left and right part of list
        boolean flag = true;
        while(right != null) {
        	if(left.val != right.val) {
        		flag = false;
        		break;
        	}
        	else {
        		left = left.next;
        		right = right.next;
        	}
        }
        
        return flag;
    }
    
    ListNode findMid(ListNode head) {
    	ListNode slow = head, fast = head.next;
    	
    	while(fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	
    	return slow;
    }
    
    ListNode reverseRightPart(ListNode rightBegin) {
    	ListNode current = rightBegin, post = rightBegin.next;
    	ListNode temp = null;
    	
    	while(post != null) {
        	temp = post;
    		post = post.next;
    		temp.next = current;
    		if(current == rightBegin) {
    			current.next = null;
    		}
    		current = temp;
    	}
    	
    	return current;
    }
}
