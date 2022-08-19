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
    public ListNode middleNode(ListNode head) {
        
            ListNode temp= head;
            int length = 0;
            while(temp != null){
                    length++;
                    temp=temp.next;
                    
            }
            
            int half = length/2;
            temp = head;
            while(half-->0){
                    temp=temp.next;
                    
            }
            return temp;
    }
}