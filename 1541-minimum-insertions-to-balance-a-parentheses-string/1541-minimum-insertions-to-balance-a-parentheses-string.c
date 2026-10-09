int minInsertions(char* s) {
    int i = 0, close = 0, open = 0;
    while (s[i] != '\0') {
        if (s[i] == '(') {
            if(close%2!=0){
                open++;
                close--;
            }
            close+=2;
        } else if (s[i] == ')') {
            if (close > 0) {
                close--;
            } else {
                open++;
                close++;
            }
        }
        i++;
    }
    return open+close;
}