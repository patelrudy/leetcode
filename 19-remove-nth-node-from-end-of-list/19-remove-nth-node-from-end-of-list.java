/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode after = dummyNode;
        ListNode before = dummyNode;
        
        for (int i = 0; i < n + 1; i++) {
            after = after.next;
        }
        
        while (after != null) {
            after = after.next;
            before = before.next;
        }
        
        before.next = before.next.next;
        return dummyNode.next;
    }
}
