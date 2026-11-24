class Solution {
    public ListNode reverseKGroup(ListNode head, int k){
    ListNode temp=head;
    int a=0;
    while(temp!=null && a<k){
        temp=temp.next;
        a++;
    }
    if (a<k) return head;

    ListNode prev=null;
    ListNode curr=head;
    int kg=k;
    while (kg-->0) {
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head.next = reverseKGroup(curr,k);
    return prev;
    }
}