package C1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;

/**
 * <b>Date 的第一种实现</b>
 * <p>该实现简单的将日、月和年设置为实例变量，这样实例方法就可以直接返回适当的值。
 */
public class Date1 {
    private final int month;
    private final int day;
    private final int year;
    public Date1(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int month() { return month; }
    public int day() { return day; }
    public int year() { return year; }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    /**
     * 测试用例
     * <pre>
     *     % java Date 12 31 1999
     *     12/31/1999
     * </pre>
     */
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Date1 date = new Date1(m, d, y);
        StdOut.println(date);
    }
}
