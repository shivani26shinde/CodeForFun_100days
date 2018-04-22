// LeetCode --> Q.725 --> Split linked-list in parts

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LinkedListParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] array = new ListNode[k];
        ListNode node = root;
        ListNode nodeTemp = root;
        int val = 0;
        while(node != null){
            val++;
            node = node.next;
        }
        int num = val/k;
        int carry = val%k;
        for(int i=0;i<k;i++){
            int j=0;
            ListNode newNode = new ListNode(0);
            ListNode tNode = newNode;
            while(j<num && nodeTemp != null){
                tNode.next =  nodeTemp;
                tNode = tNode.next;
                nodeTemp = nodeTemp.next;
                j++;
            }
            if(carry>0){
                if(nodeTemp != null){
                    tNode.next =  nodeTemp;
                    tNode = tNode.next;
                    nodeTemp = nodeTemp.next; 
                }
                carry--;
            }
            tNode.next = null;
            array[i] = newNode.next;
        }
        return array;
    }
}