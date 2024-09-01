class Solution {
    int areMatricesIdentical(int N, int[][] grid1, int[][] grid2) {
        
        if(grid1.length != grid2.length) return 0;
        if(grid1[0].length != grid2[0].length) return 0;
        
        for(int row = 0; row<grid1.length ; row++){
            for(int col = 0; col<grid1[0].length ; col++){
                if(grid1[row][col] != grid2[row][col]) 
                    return 0;
            }
        }
        return 1;
    }
}
