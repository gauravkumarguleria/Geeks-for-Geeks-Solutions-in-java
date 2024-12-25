
class Solution {
    void dfs(int[][] grid, boolean[][] vis,List<String> shape,
    int[] drow, int[] dcol,int row, int col,int baseRow,int baseCol) {
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = true;
        shape.add((row - baseRow) + "," + (col - baseCol));
        for(int i=0;i<4;i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow >=0 && nrow <n && ncol >=0 && ncol <m && 
            !vis[nrow][ncol] && grid[nrow][ncol] == 1) {
                dfs(grid,vis,shape,drow,dcol,nrow,ncol,baseRow,baseCol);
            }
        }
    }
    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Set<List<String>> uniqueShapes = new HashSet<>();
        int[] dcol = {0,-1,0,1};
        int[] drow = {1,0,-1,0};
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1 && !vis[i][j]){
                    List<String> shape = new ArrayList<>();
                    dfs(grid,vis,shape,drow,dcol,i,j,i,j);
                    uniqueShapes.add(shape);
                }
            }
        }
        return uniqueShapes.size();
    }
}
