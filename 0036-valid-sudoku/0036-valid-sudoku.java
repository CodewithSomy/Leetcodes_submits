class Solution {
    public static int check(int[] arr) {
        int end = arr.length - 1;
        while (end >= 0 && arr[end] == 0)
            end--;
        boolean[] seen = new boolean[10];
        for (int i = 0; i <= end; i++) {
            if (seen[arr[i]])
                return 0;
            seen[arr[i]] = true;
        }
        return 1;
    }
    public boolean isValidSudoku(char[][] board) {
        for (char[] rs : board) {
            int[] row = new int[9];
            int r = 0;
            for (char k : rs) {
                if (k != '.')
                    row[r++] = k - '0';
            }
            if (check(row) == 0)return false;
        }
        for (int i = 0; i < 9; i++) {
            int[] col = new int[9];
            int r = 0;
            for (char[] cs : board) {
                if (cs[i] != '.')
                    col[r++] = cs[i] - '0';
            }
            if (check(col) == 0)return false;
        }
        for (int k = 0; k < 9; k++) {
            int rs=(k/3)*3,cs=(k%3)*3;
            int[] box = new int[9];
            int L = 0;
            for (int r=0;r<3; r++) {
                for (int c=0;c<3;c++) {
                    if (board[rs+r][cs+c]!= '.')
                        box[L++] = board[rs + r][cs + c]-'0';

                }
            }if (check(box) == 0)return false;
        }
        return true;
    }
}
