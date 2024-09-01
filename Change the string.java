class Solution{
    String modify(String str){
        if(str.charAt(0) >= 'A' && str.charAt(0)<= 'Z')
            return str.toUpperCase();
            
        if(str.charAt(0) >= 'a' && str.charAt(0)<= 'z')
            return str.toLowerCase();
        
        return "";
    }
}
