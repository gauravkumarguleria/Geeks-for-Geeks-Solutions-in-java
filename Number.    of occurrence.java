
class Solution {
     public int firstOccurence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    
     public int lastOccurence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return right;
    }
    
    int count(int[] nums, int n, int target) {
        int f1 = firstOccurence(nums, target);
        int f2 = lastOccurence(nums, target);
        
        if(f1 > f2) return 0;
        
        return (f2 - f1 + 1);

    }
}
