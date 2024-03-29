package Algorithm.Easy;

public class CountTheNumberConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;

        for (String word: words) {
            for (int i = 0; i < word.length(); ++i) {
                if (allowed.indexOf(word.charAt(i)) == -1) break;
                if (i == word.length() - 1) res++;
            }
        }
        return res;
    }
}
