class Solution{
    static int powerof2(int n){
        int i = 1;
        while(2*i <= n){
            i=i*2;
        }
        return i;
    }
    static int find(int N){
        int hp = powerof2(N);
        int l = N - hp;
        return 2*l + 1;
    }
}
