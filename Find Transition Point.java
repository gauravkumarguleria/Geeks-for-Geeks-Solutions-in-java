
class Solution {
    int transitionPoint(int arr[], int n) {
        int left = 0, right = arr.length-1;
        
        if(arr[n-1]==0) return -1;
        
        while(left<=right){
            int mid  = left + (right-left)/2;
            
            if(arr[mid]< 1){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return left;
    }
}
