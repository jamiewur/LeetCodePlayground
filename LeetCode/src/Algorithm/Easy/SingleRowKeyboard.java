package Algorithm.Easy;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int ini = 0;
        int sum = 0;

        for(char c: word.toCharArray()){
            int current = keyboard.indexOf(c);
            sum += Math.abs(current-ini);
            ini = current;
        }
        return sum;
    }
}
