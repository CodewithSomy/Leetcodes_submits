class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        List<Integer> num = new ArrayList<>();
        while (temp != null) {
            num.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = num.size() - 1;
        while (i < j) {
            if (num.get(i) != num.get(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}