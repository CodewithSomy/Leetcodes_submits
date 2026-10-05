int scoreOfParentheses(char* s) {
    int i = 0, val = 0, depth = 1;
    char curr = s[i++], prev;
    while (s[i] != '\0') {
        prev = curr;
        curr = s[i++];
        if (curr == '(')
            depth++;
        if (curr == ')') {
            depth--;
            if (prev == '(') {
                val += pow(2, depth);
            }
        }
    }
    return val;
}