// LeetCode --> Q.328 --> Odd Even Linked List O(1) space

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class OddEvenLinkedListEfficient {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode prev = node;
        ListNode curr = head.next;
        ListNode startCurr = curr;
        if(curr == null || curr.next == null){
            return head;
        }
        ListNode nxt = head.next.next;
        while(curr != null && nxt != null){
            ListNode temp = curr;
            prev.next = nxt;
            temp.next = nxt.next;
            nxt.next = startCurr;
            prev = nxt;
            curr = temp;
            if(curr.next != null && curr.next.next != null){
                curr = curr.next;
                nxt = curr.next;
            }
            else{
                nxt = null;
            }
        }
        return node;
    }
}