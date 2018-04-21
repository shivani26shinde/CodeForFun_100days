// LeetCode --> Q.445 --> Two Linked-list Addition

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = reverse(l1);
        ListNode node2 = reverse(l2);
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode tmpNode = node;
        while(node1 != null || node2 != null){
            int val = 0;
            val = val+carry;
            if(node1 != null){
                val = val+node1.val;
                node1 = node1.next;
            }
            if(node2 != null){
                val = val+node2.val;
                node2 = node2.next;
            }
            if(val <= 9){
                node.next = new ListNode(val);
                carry = 0;
            }
            else{
                carry = 1;
                int num = val%10;
                node.next = new ListNode(num);
            }
            node = node.next;
        }
        if(carry > 0){
            node.next = new ListNode(carry);
            node = node.next;
        }
        node.next = null;
        ListNode retNode = reverse(tmpNode.next);
        return retNode;
    }
    public ListNode reverse(ListNode l1){
        ListNode prev = null;
        ListNode curr = l1;
        ListNode nxt = l1.next;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}