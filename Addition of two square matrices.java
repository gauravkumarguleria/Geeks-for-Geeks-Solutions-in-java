class Solution
{
    public void  Addition(int[][] grid1, int[][] grid2)
    {
        
        for(int row=0;row<grid1.length;row++){
            for(int col = 0; col<grid1.length;col++){
                grid1[row][col] += grid2[row][col];
            }
        }
    }
}
