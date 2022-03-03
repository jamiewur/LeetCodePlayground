package Algorithm.Easy;

public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String sentence: sentences) {
            int slot = 0;
            for (char c: sentence.toCharArray()) {
                if (c == ' ') slot++;
            }
            res = res > ++slot ? res : slot;
        }
        return res;
    }
}
