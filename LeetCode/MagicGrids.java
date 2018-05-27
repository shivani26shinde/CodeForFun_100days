// LeetCode --> Q.840 --> Magic Grids

class MagicGrids {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length-2;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<grid[i].length-2;j++){
                int row = i;
                int col = j;
                int one = grid[row][col];
                if(one >= 1 && one <= 9){
                    set.add(one);
                }
                else{
                    break;
                }
                col++;
                int two = grid[row][col];
                if(set.contains(two) || two < 1 || two > 9){
                   break;
                }
                else{
                   set.add(two);
                }
                col++;
                int three = grid[row][col];
                if(set.contains(three) || three < 1 || three > 9){
                   break;
                }
                else{
                   set.add(three);
                }
                col = j;
                row++;
                int four = grid[row][col];
                if(set.contains(four) || four < 1 || four > 9){
                   break;
                }
                else{
                   set.add(four);
                }
                col++;
                int five = grid[row][col];
                if(set.contains(five) || five < 1 || five > 9){
                   break;
                }
                else{
                   set.add(five);
                }
                col++;
                int six = grid[row][col];
                if(set.contains(six) || six < 1 || six > 9){
                   break;
                }
                else{
                   set.add(six);
                }
                col = j;
                row++;
                int seven = grid[row][col];
                if(set.contains(seven) || seven < 1 || seven > 9){
                   break;
                }
                else{
                   set.add(seven);
                }
                col++;
                int eight = grid[row][col];
                if(set.contains(eight) || eight < 1 || eight > 9){
                   break;
                }
                else{
                   set.add(eight);
                }
                col++;
                int nine = grid[row][col];
                if(set.contains(nine) || nine < 1 || nine > 9){
                   break;
                }
                else{
                   set.add(nine);
                }
                int sum1 = one+two+three;
                int sum2 = four+five+six;
                int sum3 = seven+eight+nine;
                int sum4 = one+five+nine;
                int sum5 = three+five+seven;
                if(sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5){
                   count++;
                }
            }
        } 
        return count;
    }
}