package Algorithm.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ReformatDate {
    public String reformatDate(String date) {
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Arrays.asList(months);
        String[] str = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(str[2]).append("-").append(Arrays.asList(months).indexOf(str[1]) + 1 < 10 ? "0".concat(String.valueOf(Arrays.asList(months).indexOf(str[1]) + 1)) : Arrays.asList(months).indexOf(str[1]) + 1).append("-").append(str[0].length() < 4 ? "0".concat(str[0].substring(0,str[0].length() -2)) : str[0].substring(0,str[0].length() -2));
        return sb.toString();
    }
}
