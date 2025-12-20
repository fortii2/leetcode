class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int resultIndex = 0;

        while (i < chars.length) {
            int currentLength = 1;

            while (i + currentLength < chars.length &&
                    chars[i] == chars[i + currentLength]){
                currentLength++;
            }

            chars[resultIndex++] = chars[i];
            if (currentLength > 1){
                for (char c : String.valueOf(currentLength).toCharArray()) {
                    chars[resultIndex++] = c;
                }
            }

            i = i + currentLength;
        }
        return resultIndex;
    }
}
