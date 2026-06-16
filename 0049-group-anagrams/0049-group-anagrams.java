class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hs = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!hs.containsKey(key)) {
                hs.put(key, new ArrayList<>());
            }

            hs.get(key).add(str);
        }

        return new ArrayList<>(hs.values());
    }
}