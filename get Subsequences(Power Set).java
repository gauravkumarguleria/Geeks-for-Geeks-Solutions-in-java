class Solution
{   
    public List<String> AllPossibleStrings(String s)
    {
        List<String> result = getSubsequences(s, 0);;
        Collections.sort(result);
        result.remove(0);
        return result;
    }
    
    public List<String> getSubsequences(String input, int idx){
        if(idx == input.length()){
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        
        List<String> result = getSubsequences(input, idx + 1);
        
        int n = result.size();
        
        for(int i=0; i<n; i++){
            String res = input.charAt(idx) + result.get(i);
            result.add(res);
        }
        return result;
       
    }
}
