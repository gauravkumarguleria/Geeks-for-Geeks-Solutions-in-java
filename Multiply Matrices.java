class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           int r1 = A.length, c1 = A[0].length;
           int r2 = A.length, c2 = A[0].length;
           
           if(c1 != r2 ) return;
           
           for(int row = 0; row<r1 ; row++){
               for(int col = 0 ; col<c2 ; col++){
                   for(int idx = 0; idx<c2; idx++){
                       C[row][col] += A[row][idx]*B[idx][col];
               }
           }
        }
    }

}
