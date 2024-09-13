class Solution {
    public boolean arraySortedOrNot(List<Integer> arr) {
        return arraySorted(arr, 0);
    }
    
    public boolean arraySorted(List<Integer> arr, int n){
        if(n == arr.size()-1) return true;
        
        if(arr.get(n)>arr.get(n+1))
            return false;
            
        return arraySorted(arr, n+1);
    }
}
