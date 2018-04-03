// LeetCode --> Q.498 --> Diagonal Traverse

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int total = 0;
        if(matrix.length >= 1 && matrix[0].length >= 1){
            total = matrix.length * matrix[0].length;
        }
        int[] array = new int[total];
        int flag = 1;
        int start = 0;
        if(matrix.length >= 1 && matrix[0].length >= 1){
            array[start] = matrix[0][0];
        }
        int i=0;
        int j=0;
        while(i < matrix.length && j < matrix[0].length){
            if(flag == 1){
                j++;
                flag = 0;
                if(j>=0 && j<matrix[0].length){
                    start++;
                    array[start] = matrix[i][j];
                }
                while(i+1 >= 0 && j-1 >= 0 && i+1 < matrix.length && j-1 < matrix[0].length){
                    i++;
                    j--;
                    start++;
                    array[start] = matrix[i][j];
                }
            }
            else{
                i++;
                flag = 1;
                if(i>=0 && i<matrix.length){
                    start++;
                    array[start] = matrix[i][j];
                }
                while(i-1 >= 0 && j+1 >= 0 && i-1 < matrix.length && j+1 < matrix[0].length){
                    i--;
                    j++;
                    start++;
                    array[start] = matrix[i][j];
                }
            } 
        }
        return array;
    }
}