package Algorithm.Easy;

public class CountSubstringswithOnlyOneDistinctLetter {
    public int countLetters(String S) {
        if(S == null || S.length() == 0) return 0;
        int count = 1;
        for(int i=1,j=0; i<S.length(); ++i) {
            if(S.charAt(i) != S.charAt(i-1)) j=i;
            count += i-j+1;
        }
        return count;
    }
}
