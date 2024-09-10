
class Solution {
    // Function to find minimum number of pages.
    public static boolean isPossible(int[] books, int allowedStudents, long maxLoad){
        int currLoad = 0;
        int currStudent = 1;
        
        for(int pages : books){
            if(currLoad + pages <= maxLoad)
                currLoad += pages;
        else{
            currLoad = pages;
            currStudent++;
        }
    }
        return currStudent <= allowedStudents;
    }
    
    public static long max(int [] pages){
        long ans = Long.MIN_VALUE;
        for(int page : pages){
            ans = Math.max(ans, page)  ;      
            
        }
        return ans;
    }
    
    public static long sum(int [] pages){
        long ans = 0;
        for(int page : pages){
            ans+=page;
        }
        return ans;
    }
    
    public static long findPages(int books, int[] pages, int students) {
        if(books<students) return -1;
        long  left = max(pages), right = sum(pages);
        
        while(left<=right){
            long mid = (left + right)/2;
            
            if(isPossible(pages,students, mid) == true){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
};
