package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<Integer>();
        int score = 0;
        for (int i = 0; i < ops.length; i++) {

            int currentScore = 0;
            if (ops[i].equals("C")) {

                currentScore = -list.get(list.size() - 1);
                score = score + currentScore;
                list.remove(list.size() - 1);

            } else if (ops[i].equals("D")) {

                currentScore = list.get(list.size() - 1) * 2;
                score = score + currentScore;
                list.add(currentScore);

            } else if (ops[i].equals("+")) {

                int temp = list.get(list.size() - 1) + list.get(list.size() - 2);
                currentScore = temp;
                score = score + currentScore;
                list.add(currentScore);

            } else {

                currentScore = Integer.valueOf(ops[i]);
                list.add(currentScore);
                score = score + currentScore;

            }

        }

        return score;
    }
}
