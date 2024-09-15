static ArrayList<String> paths;
    
    public static void findPath(int[][] mat, int row, int col, String path){
        if(row<0 || col<0 || row == mat.length || col == mat[0].length){
            return;
        }
        
        if(mat[row][col] == -1 || mat[row][col] == 0){
            return;
        }
        
        if(row == mat.length -1 && col == mat[0].length-1){
            paths.add(path);
            return;
        }
        mat[row][col] = -1;
        
        //top
        findPath(mat, row - 1, col, path + "U");
        //Bottom
        findPath(mat, row + 1, col, path + "D");
        //left
        findPath(mat, row , col - 1, path + "L");
        //right
        findPath(mat, row, col + 1, path + "R");
        
        mat[row][col] = 1;
    }
    public ArrayList<String> findPath(int[][] mat) {
        paths = new ArrayList<>();
        findPath(mat, 0, 0, "");
        return paths;
    }
}
