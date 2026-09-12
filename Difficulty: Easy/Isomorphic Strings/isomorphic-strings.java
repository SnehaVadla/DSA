class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (map1[a - 'a'] != 0 && map1[a - 'a'] != b) {
                return false;
            }

            if (map2[b - 'a'] != 0 && map2[b - 'a'] != a) {
                return false;
            }

            map1[a - 'a'] = b;
            map2[b - 'a'] = a;
        }

        return true;
    }
}