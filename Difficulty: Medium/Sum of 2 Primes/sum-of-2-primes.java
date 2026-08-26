class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int a = 2; a <= n / 2; a++) {
            int b = n - a;

            if (isPrime[a] && isPrime[b]) {
                ans.add(a);
                ans.add(b);
                return ans;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}