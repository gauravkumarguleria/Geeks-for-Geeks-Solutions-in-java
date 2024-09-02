class Solution
{
    public void transpose(int n,int mat[][])
    {
        for(int row = 0; row<n; row++){
            for(int col = row ; col<n; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }   
    }
}
