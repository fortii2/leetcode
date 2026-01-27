class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sortedArr = s.toCharArray();
            Arrays.sort(sortedArr);

            String sortedStr = new String(sortedArr);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedStr, list);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (List<String> v : map.values()) {
            res.add(v);
        }

        return res;
    }
}
