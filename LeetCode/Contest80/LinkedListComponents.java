// LeetCode --> Q.817 --> Linked List Components

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<G.length;i++){
            map.put(G[i],i);
        }
        ListNode prev = head;
        ListNode temp = head;
        while(prev != null && temp != null){
            count++;
            while(prev != null && temp != null){
                if(map.containsKey(temp.val) && map.containsKey(prev.val)){
                    if(map.get(temp.val) >= map.get(prev.val)){
                        prev = temp;
                        temp = temp.next;
                    }
                    else{
                        break;
                    }
                }
                else{
                    prev = temp.next;
                    temp = temp.next;
                    break;
                }
            }
        }
        return count;
    }
}