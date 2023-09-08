package C1_1_ProgrammingModel;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <b>标准输入
 * <p><b>输入/输出:</b>
 * <pre>
 *      1.23456
 *      2.34567
 *      3.45678
 *      4.56789
 *      ^D
 *      Average is 2.90123
 * </pre>
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
