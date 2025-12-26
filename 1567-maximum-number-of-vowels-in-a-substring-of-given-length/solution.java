class Solution {
    public int maxVowels(String s, int k) {
        int result = 0;
        int current = 0;

        for(int i = 0; i < k; i++){
            current += isVowel(s.charAt(i));
        }
        result = Math.max(result, current);

        for(int i = k; i < s.length(); i++){
            current = current - isVowel(s.charAt(i - k)) + isVowel(s.charAt(i));
            result = Math.max(result, current);
        }

        return result;
    }

    public int isVowel(char c){
        if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return 1;
        }
        return 0;
    }
}
