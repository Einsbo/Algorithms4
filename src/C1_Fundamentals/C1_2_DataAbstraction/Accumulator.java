package C1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Accumulator 的测试用例
 */
public class Accumulator {
    private double total = 0;
    private int N = 0;
    public void addDateValue(double val) {
        N++;
        total += val;
    }
    public double mean() {
        return total / N;
    }
    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }

    /**
     * <pre>
     *  % java TestAccumulator 1000
     *  Mean (1000 values): 0.49653
     * </pre>
     */
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDateValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
