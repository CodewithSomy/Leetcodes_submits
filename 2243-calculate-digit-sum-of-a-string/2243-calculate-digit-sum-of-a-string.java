class Solution {
    public String digitSum(String s, int k) {
        StringBuilder next = new StringBuilder(s);
        while (next.length() > k) {
            int leh = next.length();
            for (int i = 0; i < leh; i += k) {
                int sum = 0;
                for (int j = i; j < leh && j < i + k; j++)
                    sum += next.charAt(j) - '0';
                next.append(sum);
            }
            next.delete(0,leh);
        }
        return next.toString();
    }
}