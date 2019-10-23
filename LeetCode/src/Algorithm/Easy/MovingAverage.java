package Algorithm.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class MovingAverage {
    LinkedList<Integer> l;
    int size;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
       l = new LinkedList<>();
       this.size = size;
    }

    public double next(int val) {
        double result = 0;
        double sum = 0;
        if(l.size() >= size){
            l.removeFirst();
            l.add(val);
        }else l.add(val);
        for(int i:l){
            sum+=i;
        }
        return sum/l.size();

    }
}
