class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> word1map = new HashMap<>();
        HashMap<Character, Integer> word2map = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            word1map.put(word1.charAt(i),
                    word1map.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            word2map.put(word2.charAt(i),
                    word2map.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!word1map.keySet().equals(word2map.keySet())) return false;

        List<Integer> l1 = word1map.values().stream().sorted().toList();
        List<Integer> l2 = word2map.values().stream().sorted().toList();

        return l1.equals(l2);
    }
}
