class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];

        // Count characters in chars
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] wordCount = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
                if (wordCount[c - 'a'] > charCount[c - 'a']) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                sum += word.length();
            }
        }

        return sum;
    }
}