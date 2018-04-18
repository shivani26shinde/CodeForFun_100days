// LeetCode --> Q.141 --> Linked List Cycle

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
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode prev = head;
        ListNode curr = head;
        while(curr != null && curr.next != null && curr.next.next != null){
            prev = prev.next;
            curr = curr.next.next;
            if(prev == curr){
                return true;
            }
        }
        return false;
    }
}