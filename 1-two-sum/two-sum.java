class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int diff;
        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if(mp.containsKey(diff)){
                return new int[]{mp.get(diff),i};
            }
            else{
                mp.put(nums[i],i);
            }
        }
       return new int[]{};
    }
}