package Basic;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * <p><b>StdOut 的用例示范</b>
 * <p><b>IDEA settings: </b>
 * <p>
 * IDEA program arguments: 5 100.0 200.0
 * <p><b>Input:</b>
 * $ java RandomSeq 5 100.0 200.0
 * <p><b>Output:</b>
 * 131.54, 162.44, 115.87, 198.34, 132.97
 */
public class RandomSeq {
    public static void main(String[] args) {
        // 打印 N 个 (lo, hi) 之间的值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
