class Solution {
    static ListNode reverseList(ListNode head, ListNode end) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=end){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1) return head;

        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode PGTail=temp;

        while(true){
            ListNode knode=PGTail;
            for(int i=0;i<k&&knode!=null;i++){
                knode=knode.next;
            }
            if(knode==null) break;

            ListNode gStart=PGTail.next;
            ListNode nextG=knode.next;

            PGTail.next=reverseList(gStart,nextG);
            gStart.next=nextG;
            PGTail=gStart;
        }

        return temp.next;
    }
}
