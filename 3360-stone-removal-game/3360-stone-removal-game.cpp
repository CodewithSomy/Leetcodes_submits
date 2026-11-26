class Solution {
public:
    bool canAliceWin(int n) {
        return !(n<10 || (n<27 && n>18) || (n<40 && n>33) || (n<49 && n>44));
    }
};