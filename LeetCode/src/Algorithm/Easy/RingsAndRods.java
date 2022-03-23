package Algorithm.Easy;

public class RingsAndRods {
    public int countPoints(String rings) {
        int res = 0;
        String [] s = new String[10];

        for (int i = 0; i < rings.length() - 3; i+= 2) {
            s[rings.charAt(i+1) - 48] = s[rings.charAt(i+1) -48 ] + rings.charAt(i);
        }


        for (String ss: s) {
            if (ss == null) continue;
            if (ss.indexOf('R') > 0 && ss.indexOf('G') > 0 && ss.indexOf('B') > 0 ) res++;
        }

        return res;
    }

    public static void main(String[] args) {
        RingsAndRods r = new RingsAndRods();
        int test = r.countPoints("B9R9G0R4G6R8R2R9G9");
        System.out.println(test);
    }
}
