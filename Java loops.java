class Solution{
    static ArrayList<Integer> getSum(int N){
        int sumOdd = 0, sumEven = 0;
        
        for(int idx = 1; idx<=N ; idx++){
            if(idx%2 == 0) sumEven += idx;
            else
                sumOdd += idx;
        }
        ArrayList<Integer> ans =  new ArrayList<>();
        
        ans.add(sumEven);
        ans.add(sumOdd);
    
        return ans;
    }
}
