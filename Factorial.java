class Solution{
    static long factorial(int N){
        if(N == 0) return 1;
        
        return N*factorial(N-1);
        
    }
}


//////////////////////////////////////////////////
class Solution{
    static long factorial(int N){
        return (N==0)?1:N*factorial(N-1);
        
    }
}
