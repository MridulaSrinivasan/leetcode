// Last updated: 2/13/2026, 11:34:00 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode current = n;
        int c = 0;
        while(l1 != null || l2 != null || c != 0){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;
            int sum = x+y+c;
            c=sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        } 
        return n.next;
    }
}