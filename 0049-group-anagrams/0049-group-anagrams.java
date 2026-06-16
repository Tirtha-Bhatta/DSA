class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> hs=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray(); //convert string into char array
            Arrays.sort(arr);             //sort the array
            String key=new String(arr);    //convert back to string and store in key
            if(!hs.containsKey(key)){     //check the wheather the key available in hashmap or not
                hs.put(key,new ArrayList<>());
            }

            hs.get(key).add(str);
        }
        return new ArrayList<>(hs.values());
    }
}