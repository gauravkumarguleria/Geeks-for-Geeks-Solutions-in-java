import java.util.ArrayList;

public class Solution 
{
    public static boolean isPossible(int[] books, int allowedStuds, long maxLoad){
        long currLoad = 0;
        int reqdStuds = 1;

        for(long pages: books){
            if(currLoad + pages <= maxLoad)
                currLoad+=pages;
        
        else{
            currLoad = pages;
            reqdStuds++;
        }
        }
 return (reqdStuds<=allowedStuds);
    }
    
    
    public static long max(int[] books){
        long ans = 0;
        for(long pages : books){
            ans = Math.max(ans,pages);
        }
        return ans;
    }

     public static long sum(int[] books){
        long ans = 0;
        for(long pages : books){
            ans += pages;
        }
        return ans;
    }
    public  static int findLargestMinDistance(ArrayList<Integer> arr, int studs)
    {    int[] books = new int[arr.size()];
         for(int idx = 0; idx<arr.size(); idx++){
             books[idx] = arr.get(idx);
         }

         long left = max(books) , right= sum(books);
         while(left<=right){
            long mid = (left+right)/2;
            if(isPossible(books, studs,mid) == true)
                right = mid-1;
            else left = mid+1;
        }   
        return (int)left;
    
    }
}
