package Chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <p><b>StdIn 的用例举例</b>
 * <p><b>Input:</b> 1.23456, 2.34567, 3.45678, 4.56789, {@code ctrl-d}
 * <p><b>Output: </b> Average is 2.90123
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
