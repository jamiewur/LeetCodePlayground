package Algorithm.Easy;


public class ReverseWordsStringIII {
    public String reverseWords(String s) {
        String[] srg = s.split(" ");
        StringBuilder r = new StringBuilder();
        for (String st : srg) {

            for (int i = 0; i < st.length(); i++) {
                r.append(st.charAt(st.length()-1-i));
            }
            r.append(' ');
        }
        return r.toString().trim();
    }
}
