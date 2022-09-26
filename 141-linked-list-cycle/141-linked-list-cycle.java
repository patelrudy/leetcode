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
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        
        for (ListNode curr = head; curr != null; curr = curr.next) {
            if (seen.contains(curr)) {
                return true;
            }
            seen.add(curr);
        }
        return false;
    }
}