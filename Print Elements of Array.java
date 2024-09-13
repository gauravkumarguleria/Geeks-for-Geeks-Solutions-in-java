class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        printing(arr, 0);
    }
    
    void printing(int []arr, int n){
        System.out.print(arr[n]+" ");
        if(n<arr.length-1)
            printing(arr,n+1);
    }
    
}
