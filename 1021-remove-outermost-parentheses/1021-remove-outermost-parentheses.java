class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder output = new StringBuilder(s);
        int i = s.length() - 1;
        while (i >= 0) {
            char c = output.charAt(i);
            if (c == ')') {
                if (open == 0)
                    output.deleteCharAt(i);
                open++;
            } else if (c == '(') {
                open--;
                if (open == 0)
                    output.deleteCharAt(i);
            }
            i--;
        }
        return output.toString();
    }
}
