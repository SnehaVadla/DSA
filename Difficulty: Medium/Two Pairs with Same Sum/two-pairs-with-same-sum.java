class Solution {
    public List<Integer> findEqualSumIndices(int[] arr) {
        int n = arr.length;
        HashMap<Integer, int[]> map = new HashMap<>();

        List<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        ans.add(-1);
        ans.add(-1);

        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {

                int sum = arr[a] + arr[b];

                if (map.containsKey(sum)) {
                    int[] p = map.get(sum);

                    if (p[0] != a && p[0] != b &&
                        p[1] != a && p[1] != b) {

                        if (ans.get(0) == -1 ||
                            p[0] < ans.get(0) ||
                            (p[0] == ans.get(0) && p[1] < ans.get(1)) ||
                            (p[0] == ans.get(0) && p[1] == ans.get(1) && a < ans.get(2)) ||
                            (p[0] == ans.get(0) && p[1] == ans.get(1) &&
                             a == ans.get(2) && b < ans.get(3))) {

                            ans.set(0, p[0]);
                            ans.set(1, p[1]);
                            ans.set(2, a);
                            ans.set(3, b);
                        }
                    }
                } else {
                    map.put(sum, new int[]{a, b});
                }
            }
        }

        return ans;
    }
}