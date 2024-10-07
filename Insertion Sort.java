class Solution
{
  public static int compare(int [] arr, int l, int r){
        if(arr[l] < arr[r]) return -1;
        else if (arr[l] > arr[r]) return +1;
        else return 0;
        
    }
    public static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
  
  public void insertionSort(int arr[], int n)
  {
      for(int i = 1; i< n; i++){
          for(int j = i ; j>0 ; j--){
              if(compare(arr,j-1 ,j) > 0){
                  swap(arr, j, j-1);
              }
              else break;
          }
      }
  }
}
