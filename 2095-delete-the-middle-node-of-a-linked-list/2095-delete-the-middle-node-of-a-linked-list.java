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
class Solution{
    public ListNode deleteMiddle(ListNode head){
        if(head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=s.next;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        s.next=s.next.next;
        return head;
    }
}