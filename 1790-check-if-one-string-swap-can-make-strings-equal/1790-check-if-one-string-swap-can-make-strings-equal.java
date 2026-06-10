class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] diffs = new int[2];
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count == 2) return false; // more than 2 mismatches
                diffs[count++] = i;
            }
        }

        // 0 mismatches: already equal
        if (count == 0) return true;

        // exactly 2 mismatches: check cross-match
        if (count == 2) {
            int i = diffs[0], j = diffs[1];
            return s1.charAt(i) == s2.charAt(j) &&
                   s1.charAt(j) == s2.charAt(i);
        }

        // 1 mismatch: impossible
        return false;
    }
}