class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int N)
    {
        int zeros = 0;
        int row = 0, col = N-1;
        while(row<N&&col>=0){
            
            if(A[row][col] == 0){
                row++;
                zeros += (col+1);
          
            }
            else col--;
        }
        return zeros;
    }
}
