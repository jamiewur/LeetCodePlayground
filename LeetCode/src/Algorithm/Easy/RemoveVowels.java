package Algorithm.Easy;

public class RemoveVowels {
    public String removeVowels(String S) {
        String vowelString = "aeiou";
        StringBuilder sb = new StringBuilder();
        int n = S.length();

        for(int i=0; i<n;i++){
            if(!vowelString.contains(S.substring(i,i))) sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}
