// LeetCode --> Q.766 --> Toeplitz Matrix

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length == 0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<matrix.length && j<matrix[0].length){
            int temp = j;
            int val = matrix[i][j];
            while(i<matrix.length && j<matrix[0].length){
                if(val != matrix[i][j]){
                    return false;
                }
                i++;
                j++;
            }
            i=0;
            j = temp+1;
        }
        if(matrix.length > 1){
            i=1;
            j=0;
            while(i<matrix.length && j<matrix[0].length){
                int temp = i;
                int val = matrix[i][j];
                while(i<matrix.length && j<matrix[0].length){
                    if(val != matrix[i][j]){
                        return false;
                    }
                    i++;
                    j++;
                }
                j=0;
                i = temp+1;
            }
        }
        return true;
    }
}