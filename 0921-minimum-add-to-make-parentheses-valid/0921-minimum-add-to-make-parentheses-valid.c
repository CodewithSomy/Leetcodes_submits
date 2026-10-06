int minAddToMakeValid(char* s) {
    int cancel = 0, extras = 0, i = 0;
    while (s[i] != '\0') {
        if (s[i] == '(')
            cancel++;
        if (s[i] == ')') {
            if (cancel == 0)
                extras++;
            else
                cancel--;
        }
        i++;
    }
    return cancel + extras;
}