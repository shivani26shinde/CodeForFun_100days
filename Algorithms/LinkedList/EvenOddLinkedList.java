// LeetCode --> Q.328 --> Even Odd Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class EvenOddLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode start = head;
        ListNode odd = head;
        ListNode eve = head.next;
        ListNode curr = head;
        while(odd != null && eve != null){
            ListNode temp = eve.next;
            if(temp != null){
                odd.next = eve.next;
                odd = odd.next;
                eve.next = odd.next;
                eve = eve.next;
            }
            else{
                break;
            }
        }
        odd.next = curr;
        return start;
    }
}