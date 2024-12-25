class Solution {
    ArrayList<String> res = new ArrayList<>();
    
    public void helper(String val, String s){
        if(s.length() == 0) {
            res.add(val);
            return;
        }
        
        char ch = s.charAt(0);
        helper(val+" "+ch, s.substring(1));
        helper(val+ch,s.substring(1));
    }
    ArrayList<String> permutation(String s) {
        String sb =  "";
        sb += s.charAt(0); //A
        s = s.substring(1); //BC
        helper(sb, s);
        return res;
    }
}
