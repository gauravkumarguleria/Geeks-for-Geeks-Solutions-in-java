class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
       int n =arr.length;
       ArrayList<Integer> ans = new ArrayList<>();
       ArrayList<Integer> ans1 = new ArrayList<>();
       ans1.add(-1);
       for(int idx = 0; idx< n; idx++){
           int original = arr[idx]%(n+1);
           if(original<n)
                arr[original] +=(n+1);
       }
       
       for(int idx = 0; idx<n ; idx++){
           int freq = arr[idx]/(n+1);
           if(freq>1) ans.add(idx);
       }
       if(ans.size() == 0 ) return ans1;
       Collections.sort(ans);
       return ans;
    }
}
