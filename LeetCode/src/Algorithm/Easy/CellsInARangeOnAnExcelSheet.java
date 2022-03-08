package Algorithm.Easy;

import java.util.LinkedList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public List<String> cellsInRange(String s) {
        List<String> res = new LinkedList<>();

        String[] S = s.split(":");

        for (int i = S[0].charAt(0); i <= S[1].charAt(0); i++) {
            for (int j = S[0].charAt(1); j <= S[1].charAt(1); j++) {
                res.add("" + (char)i + (char)j);
            }
        }

        return res;
    }
}
