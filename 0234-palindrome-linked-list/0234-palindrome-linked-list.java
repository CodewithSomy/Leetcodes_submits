class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        ListNode firstpart = head;
        ListNode secondpart = prev;
        while (secondpart != null) {
            if (firstpart.val != secondpart.val)
                return false;
            firstpart = firstpart.next;
            secondpart = secondpart.next;
        }

        return true;
    }
}
