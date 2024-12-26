class Sol {
    public static int search(int n, int arr[]) {
        int ans = 0;
        
        for(int val : arr){
            ans ^= val;
        }
        
        return ans;
    }
}
