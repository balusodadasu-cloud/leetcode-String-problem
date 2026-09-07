class Solution {
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            set.add(word);
        }
        String answer = "";
        for (String word : words) {
            boolean valid = true;
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (!set.contains(prefix)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {

                if (word.length() > answer.length()) {
                    answer = word;
                }
                else if (word.length() == answer.length()
                         && word.compareTo(answer) < 0) {
                    answer = word;
                }
            }
        }

        return answer;
    }
}