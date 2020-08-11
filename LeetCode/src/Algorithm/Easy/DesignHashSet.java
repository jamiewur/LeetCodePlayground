package Algorithm.Easy;

import java.util.LinkedList;

public class DesignHashSet {
    /** Initialize your data structure here. */
    LinkedList<Integer> a;

    public DesignHashSet() {
        a = new LinkedList<>();
    }

    public void add(int key) {
        if (!a.contains(key)) a.add(key);
    }

    public void remove(int key) {
        if (a.contains(key)) a.remove(a.indexOf(key));
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (a.contains(key)) return true;
        else return false;
    }
}
