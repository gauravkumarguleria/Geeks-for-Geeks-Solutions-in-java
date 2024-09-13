class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        return linearIndex( arr, key, 0);
    }
    
    static int[] linearIndex(int[] arr, int key, int idx){
        if(idx == arr.length) return new int[]{-1,-1};
        int[] ans = linearIndex( arr, key, idx+1);
        if(arr[idx] == key){
            if(ans[0] == -1){
            ans[0]= ans[1] = idx;
        }
        else{
            ans[0] = idx;
         }
        }
        
        return ans;
    
    }
}
