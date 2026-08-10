#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

bool isValid(char* s) {
    if (s == NULL || s[0] == '\0') {
        return false;
    }

    size_t len = strlen(s);
    char *stack = malloc(len + 1);
    if (stack == NULL) {
        return false;
    }

    size_t top = 0;
    for (size_t i = 0; i < len; ++i) {
        char c = s[i];
        if (c == '(' || c == '{' || c == '[') {
            stack[top++] = c;
        } else {
            if (top == 0) {
                free(stack);
                return false;
            }

            char open = stack[--top];
            if ((c == ')' && open != '(') ||
                (c == '}' && open != '{') ||
                (c == ']' && open != '[')) {
                free(stack);
                return false;
            }
        }
    }

    bool result = (top == 0);
    free(stack);
    return result;
}