class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || k==0 || head.next==null) {
            return head;
        }
        ListNode temp=head;
        int lihlen=1;
        while (temp.next!=null) {
            lihlen++;
            temp=temp.next;
        }
        int j=k%lihlen;

        if (j==0 || j==lihlen)return head;

        temp.next=head;
        for (int i=0;i<lihlen-j;i++) {
            temp=temp.next;
        }
        
        head=temp.next;
        temp.next=null;
        return head;
    }
}