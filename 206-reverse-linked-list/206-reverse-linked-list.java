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
    public ListNode reverseList(ListNode head) {
            if(head == null) return null;
            if (head.next == null) {
            return head;
        }
        // Ask recursion to return the Reversed Head
        // Have Faith

        ListNode reverseHead = reverseList(head.next);

        // Reverse the Adjacent Nodes that is, Head & Head's Next Node

        head.next.next = head;
        head.next = null;

        // Return the Reversed Head at the end

        return reverseHead;
        
    }
}