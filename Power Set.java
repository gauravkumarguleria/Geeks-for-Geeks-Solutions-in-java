class Solution
{   List<String> ans;
    public List<String> AllPossibleStrings(String input)
    {   
        ans = new ArrayList<>();
        printSubsequences(input, 0, "");
        Collections.sort(ans);
        return ans;
        
    }
    
    public void printSubsequences(String input, int idx, String output){
        if(idx == input.length()){
            if(output.length() != 0)
                ans.add(output);
            return;
        }
        
        printSubsequences(input, idx + 1, output + input.charAt(idx));
        printSubsequences(input, idx + 1, output);
    }
}
