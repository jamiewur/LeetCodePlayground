package Algorithm.Easy;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numWB(numBottles,0,numExchange);
    }

    public int numWB(int numBottles, int empBottles, int numExchange) {
        if ( numBottles == 0) return 0;
        return numBottles + numWB( ( numBottles + empBottles )/numExchange,  ( numBottles + empBottles ) % numExchange, numExchange);
    }

    public static void main(String[] args) {
        WaterBottles wb = new WaterBottles();
        System.out.println(wb.numWaterBottles(9,3));
        System.out.println(1%3);
    }
}
