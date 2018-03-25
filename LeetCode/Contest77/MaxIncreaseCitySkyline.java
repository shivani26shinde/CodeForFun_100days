// Leetcode --> Q.807 --> Max increase to keep city skyline

class MaxIncreaseCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[][] array = new int[grid.length][grid[0].length];
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int max = 0;
            for(int j=0;j<grid[0].length;j++){
                max = Math.max(max, grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
            row[i] = max;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                array[i][j] = Math.min(row[i], col[j]);
            }
        }
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum = sum + Math.abs(array[i][j]-grid[i][j]);
            }
        }
        return sum;
    }
}
