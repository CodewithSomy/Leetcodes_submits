class Solution(object):
    def solveSudoku(self, board):
        row=[0]*9
        col=[0]*9
        box=[0]*9
        empty=[]

        for i,rows in enumerate(board):
            for j,item in enumerate(rows):
                if item!=".":
                    mask=1<<int(item)
                    k=(i//3)*3+(j//3)
                    row[i]|=mask
                    col[j]|=mask
                    box[k]|=mask
                else:
                    empty.append([i,j])
        def backtrack(Cindex):
            if (Cindex==len(empty)):return True
            (i,j)=empty[Cindex]
            Bindex=(i//3)*3+(j//3)

            takennums=row[i]|col[j]|box[Bindex]

            for digit in range(1,10):
                mask=1<<digit
                if (takennums & mask)==0:
                    board[i][j]=str(digit)
                    row[i]=row[i]|mask
                    col[j]=col[j]|mask
                    box[Bindex]=box[Bindex]|mask

                    if backtrack(Cindex+1):
                        return True
                    board[i][j] = "."
                    row[i]=row[i]^mask
                    col[j]=col[j]^mask
                    box[Bindex]=box[Bindex]^mask
            return False
        backtrack(0)
