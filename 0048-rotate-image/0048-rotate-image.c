void rotate(int** matrix, int matrixSize, int* matrixColSize) {
	int temp;
	for(int i=0;i<matrixSize;i++){
		for(int j=i;j<matrixSize;j++){
			temp=matrix[i][j];
			matrix[i][j]=matrix[j][i];
			matrix[j][i]=temp;
		}
	}
	for (int r=0;r<matrixSize;r++) {
        for (int c=0;c<matrixSize/2;c++) {
            temp = matrix[r][c];
            matrix[r][c]=matrix[r][matrixSize-1-c];
            matrix[r][matrixSize-1-c]=temp;
        }
    }
}