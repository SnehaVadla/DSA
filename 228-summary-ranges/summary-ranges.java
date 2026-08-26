class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; ) {
            int start = i;
            while (i + 1 < n && (long) nums[i + 1] == (long) nums[i] + 1) {
                i++;
            }
            if (start == i) {
                ans.add(String.valueOf(nums[i]));
            }
            else {
                ans.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }
        return ans;
    }
}