class Solution {
    public static String encode(String str) {
        StringBuilder res = new StringBuilder();
        
        int left = 0, right = 0;
        while(left < str.length()){
            char ch = str.charAt(left);
            int freq = 0;

            while(right< str.length() && str.charAt(right) == ch){
                freq++; right++;
            }

            res.append(ch);
            res.append(freq);

            left = right;
        }
        return res.toString();
    }
}
