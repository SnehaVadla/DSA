class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            int required = target - x;

            if (set.contains(required)) {
                return true;
            }

            set.add(x);
        }

        return false;
    }
}
   