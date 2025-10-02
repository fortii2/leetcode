class Solution {
    public boolean isAnagram(String s, String t) {
        byte[] sBytes = s.getBytes();
        byte[] tBytes = t.getBytes();

        Arrays.sort(sBytes);
        Arrays.sort(tBytes);

        return Arrays.equals(sBytes, tBytes);
    }
}
