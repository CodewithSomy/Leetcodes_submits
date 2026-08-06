int smallestNumber(int n, int t) {
    if (t == 1) return n;
    int temp = n;
    while (1) {
        int num = temp;
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        if (product % t == 0) {
            break; 
        } else {
            ++temp;
        }
    }
    return temp;
}
