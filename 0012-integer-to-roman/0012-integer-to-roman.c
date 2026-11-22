char* intToRoman(int num) {
    const int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    const char* symbols[] = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                             "XL", "X",  "IX", "V",  "IV", "I"};

    char* res = (char*)malloc(16 * sizeof(char));
    int p = 0;

    for (int i = 0; i < 13; i++) {
        while (num >= values[i]) {
            num -= values[i];
            const char* s = symbols[i];
            while (*s) {
                res[p++] = *s++;
            }
        }
    }
    res[p] = '\0';
    return res;
}
