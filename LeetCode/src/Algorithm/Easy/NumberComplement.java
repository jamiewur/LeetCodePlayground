package Algorithm.Easy;

public class NumberComplement {
    public static int findComplement(int num) {
        String bi = Integer.toBinaryString(num);
        bi = bi.replace('0','2');
        bi = bi.replace('1','0');
        bi = bi.replace('2','1');
        return Integer.parseInt(bi,2);
    }
    public int findComplement2(int num) {
        int mask = (Integer.highestOneBit(num)<<1) - 1;
        int a = ~num;
        return a & mask;
    }
}
