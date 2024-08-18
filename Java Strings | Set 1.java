class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder str = new StringBuilder(S1+S2);
        return str.reverse().toString();
    }
}
