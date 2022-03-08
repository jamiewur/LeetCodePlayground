package Algorithm.Easy;

public class SortingTheSentence {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] S = s.split(" ");
        String[] res = new String[S.length];
        int i = 0;
        for (String ele: S) {
            i = (int) (ele.charAt(ele.length() - 1) - '0');
            res[i - 1] = ele.substring(0, ele.length() - 1);
        }

        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");
        sb.append(res[i]);
        return sb.toString();
    }
}
