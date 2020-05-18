package Algorithm.Easy;

public class FindWordsThatCanBeFormeCharacters {
    public int countCharacters(String[] words, String chars) {
        if (words.length == 0 || chars.length() == 0) return 0;

        int sum = 0;

        for (String word: words) {
            int [] chara = new int[26];
            for (char c: chars.toCharArray()) chara[c-97]++;
            boolean isGood = true;

            for (char c: word.toCharArray()) {
                if (chara[c-97] == 0 ) isGood = false;
                else chara[c-97]--;
            }
            if (isGood) sum += word.length();
        }

        return sum;
    }
}
