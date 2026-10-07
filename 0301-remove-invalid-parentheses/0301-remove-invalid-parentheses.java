class Solution {
    public void dfs(
            int idx, String curr,
            int net,
            int exopen,
            int exclose, String s,
            Set<String> output) {
        if (net < 0)
            return;

        if (idx == s.length()) {
            if (exopen == 0 && exclose == 0 && net == 0)
                output.add(curr);
            return;
        }
        char c = s.charAt(idx);

        if (c == '(') {
            dfs(idx + 1, curr + "(", net + 1, exopen, exclose, s, output);
            dfs(idx + 1, curr, net, exopen - 1, exclose, s, output);
        } else if (c == ')') {
            dfs(idx + 1, curr + ")", net - 1, exopen, exclose, s, output);
            dfs(idx + 1, curr, net, exopen, exclose - 1, s, output);
        } else {
            dfs(idx + 1, curr + c, net, exopen, exclose, s, output);
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        int exopen = 0, exclose = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                exopen++;
            } else if (c == ')') {
                if (exopen > 0)
                    exopen--;
                else
                    exclose++;
            }
        }
        Set<String> output = new HashSet<>();
        dfs(0, "", 0, exopen, exclose, s, output);

        return new ArrayList<>(output);
    }
}