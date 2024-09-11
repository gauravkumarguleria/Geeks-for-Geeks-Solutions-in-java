
class Solution {
    public static double maxAdjacent(int[] stations){
        double ans = 0.0;
        for(int idx = 0; idx<stations.length-1; idx++ ){
            ans = Math.max(ans, stations[idx+1] - stations[idx]);
            
        }
        return ans;
        
    }
    
    public static boolean isPossible(int[] stations, int allowedStations, double dist){
        int reqdStations = 0;
        for(int idx = 0; idx< stations.length - 1; idx++){
            double gap = (stations[idx+1] - stations[idx])/dist;
            reqdStations += (int)Math.ceil(gap) - 1;
        }
        return (reqdStations<=allowedStations);
    }
    
    public static double findSmallestMaxDist(int stations[], int allowedStations) {
        Arrays.sort(stations);
        
        double left = 0.0, right = maxAdjacent(stations);
        
        while( right-left > 1e-6){
            double mid = left +  (right - left)/2.0;
            
            if(isPossible(stations, allowedStations, mid) == true){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }
}
