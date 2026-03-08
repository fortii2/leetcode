class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<List<Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] arr = new int[26];

            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            List<Integer> key = new ArrayList<>();
            for(int i: arr){
                key.add(i);
            }
            
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
