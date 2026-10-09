int minInsertions(char* s) {
    int close = 0, open = 0;
    while (*s != '\0') {
        if (*s == '(') {
            if (close % 2 != 0) {
                open++;
                close--;
            }
            close += 2;
        } else if (*s == ')') {
            if (close > 0) {
                close--;
            } else {
                open++;
                close++;
            }
        }
        s++;
    }
    return open + close;
}