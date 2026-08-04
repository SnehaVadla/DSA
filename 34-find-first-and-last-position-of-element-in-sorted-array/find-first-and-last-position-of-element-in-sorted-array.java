class Solution {

    public int[] searchRange(int[] nums, int target) {
        int f = find(nums, target, true);
        int l = find(nums, target, false);
        return new int[]{f, l};
    }
    public int find(int[] nums, int target, boolean f) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (f) {
                    high = mid - 1; 
                } else {
                    low = mid + 1;   
                }
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}