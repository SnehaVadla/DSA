class Solution {
    public String countSort(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.append((char) (i + 'a'));
                freq[i]--;
            }
        }
        return ans.toString();
    }
}