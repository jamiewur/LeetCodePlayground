package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            boolean ifDividingNumber = true;
            String numberString = Integer.toString(i);
            if (!numberString.contains("0")) {
                for (int j = 0; j < numberString.length(); j++) {
                    if (i % (numberString.charAt(j) - '0') != 0) {
                        ifDividingNumber = false;
                    }
                }
                if (ifDividingNumber) {
                    numbers.add(i);
                }
            }
        }
        return numbers;
    }
}
