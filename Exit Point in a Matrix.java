class Solution {
    public int[] FindExitPoint(int n, int m, int[][] mat) {
        int row = 0, col = 0, direction = 0;
        
        while(row>=0 && col>=0 && row<mat.length && col<mat[0].length){
            if(mat[row][col] == 1){
                mat[row][col] = 0;
                direction = (direction+1)%4;
            }
            
            if(direction == 0){
                col++;
            }
            else if(direction == 1){
                row++;
            }
            else if(direction == 2){
                col--;
            }
            else{
                row--;
            }
        }
        
        if(row<0){
            return new int[]{row+1,col};    
        }
        else if(col<0){
            return new int[]{row, col+1};
        }
        else if(row == mat.length){
            return new int[]{row -1, col};
        }else 
            return new int[]{row, col-1};
        
    }
}
