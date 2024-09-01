class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int mat[][])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int row = 0 ; row< mat.length ; row++){
            if(row%2 == 0){
                for(int col = 0 ; col<mat[0].length ; col++){
                    ans.add(mat[row][col]);
                }
            }
            else{
                for(int col = mat[0].length-1 ; col>=0 ; col--){
                    ans.add(mat[row][col]);
                }
            }
        }
        return ans;
    }
}
