package Algorithm.Easy;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String numb = String.valueOf(num);

        if (numb.contains("6")) {
            int a = numb.indexOf("6");
            String n = numb.substring(0,a) + "9" + numb.substring(a+1);
            return Integer.parseInt(n);
        }
        else return num;
    }
}
