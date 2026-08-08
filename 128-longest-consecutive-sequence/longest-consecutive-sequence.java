class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int max = 0;
        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int cur = num;
                int len = 1;
                while (hs.contains(cur + 1)) {
                    cur++;
                    len++;
                }
                max = Math.max(max, len);
            }
        }
        return max; 
    }
}