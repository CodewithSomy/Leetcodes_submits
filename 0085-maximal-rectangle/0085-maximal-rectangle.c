int maximalRectangle(char** matrix, int matrixSize, int* matrixColSize) {
	int maxArea = 0;
	int int_max = 2147483647;
	for (int i = 0; i < matrixSize; i++) {
		for (int j = 0; j < matrixColSize[i]; j++) {
			if (matrix[i][j] == '1') {
				int width = int_max;
				for (int k = i; k < matrixSize && matrix[k][j] == '1'; k++) {
					int currentWidth = 0;
					while (j + currentWidth < matrixColSize[k] && matrix[k][j + currentWidth] == '1') {
						currentWidth++;
					}
					width = fmin(width, currentWidth);
					int area = width * (k - i + 1);
					maxArea = fmax(maxArea, area);
				}
			}
		}
	}
    return maxArea;  
}