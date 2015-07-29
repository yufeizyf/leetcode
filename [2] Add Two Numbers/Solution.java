/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */



public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	if(l1 == null && l2 == null) return null;

    	

    	ListNode result = new ListNode(-1);

    	ListNode current = result;

    	

    	int carry = 0;

    	

    	while(l1 != null || l2 != null) {

    		int sum = 0;

    		if(l1 != null) {

    			sum = sum + l1.val;

    			l1 = l1.next;

    		}

    		

    		if(l2 != null) {

    			sum = sum + l2.val;

    			l2 = l2.next;

    		}

    		

    		sum = sum + carry;

    		if(sum >= 10) {

    			carry = sum / 10;

    		}

    		else {

    			carry = 0;

    		}

    		

    		current.next = new ListNode(sum % 10);

    		current = current.next;

    	}

    	

    	if(carry != 0) {

    		current.next = new ListNode(carry);

    	}

    	

    	return result.next;

    }

}
