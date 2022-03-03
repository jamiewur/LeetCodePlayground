package Algorithm.Easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') val++;
            else val--;
        }
        return val;
    }
}
