package Algorithm.Easy;

import Algorithm.Assist.CustomFunction;

import java.util.ArrayList;
import java.util.List;

public class FindPositiveIntegerSolutionEquation {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> list = new ArrayList<>();

        // find out each possible solution,  int > 0 less and equal to z
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z; j++) {
                if (customfunction.f(i,j) == z) {
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    list.add(a);

                }
            }
        }

        return list;
    }
}
