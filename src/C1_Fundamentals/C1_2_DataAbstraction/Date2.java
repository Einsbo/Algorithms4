package C1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;

/**
 * <b>Date 的第二种实现</b>
 * <p>该实现更节省空间，代价是在向用例按照约定的格式提供这些值时话费的时间更多（要进行一两次算术运算）。
 */
public class Date2 {
    private final int value;
    public Date2(int m, int d, int y) {
        value = y * 512 + m * 32 + d;
    }

    public int month() {
        return (value / 32) % 16;
    }
    public int day() {
        return value % 32;
    }
    public int year() {
        return value / 512;
    }
    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Date2 date = new Date2(m, d, y);
        StdOut.println(date);
    }
}
