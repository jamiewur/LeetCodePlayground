package Algorithm.Easy;

public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int r = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                int plus = r*num_people + 1 + i;
                if(candies > plus) {
                    res[i] += plus;
                    candies -= plus;
                }
                else {
                    res[i] += candies;
                    candies = 0;
                }
            }
            r++;
        }


        return res;
    }
    public int[] distributeCandies1(int candies, int num_people) {
        int[] res = new int[num_people];
        // find the round
        int r = 0;
        while (r*num_people * (r * num_people - 1)/2 < candies) r++;
        // get the rest of candies
        for (int i = 0; i < num_people; i++){
            for (int j = 0; j <= r; j++) {
                int plus = r*num_people + 1 + i;
                if (candies > plus) {
                    res[i] += plus;
                    candies -= plus;
                }else {
                    res[i] += candies;
                    candies =0;
                }
            }
        }


        return res;
    }
}
