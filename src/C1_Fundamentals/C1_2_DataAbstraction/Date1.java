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

    @Override
    public boolean equals(Object x) {
        // 如果该对象的引用和参数对象的引用相同，返回 true
        if (this == x) return true;
        // 如果参数为 null，根据约定返回 false
        if (x == null) return false;
        // 如果两个对象的类不同，返回 false
        if (this.getClass() != x.getClass()) return false;
        // 将参数对象的类型从 Object 转换到 Date1，如果任意实例变量的值不同，返回 false
        Date1 that = (Date1) x;
        if (this.day != that.day)       return false;
        if (this.month != that.month)   return false;
        if (this.year != that.year)     return false;
        return true;
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
