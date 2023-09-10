package C1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * <b>Bag 的典型用例</b>
 * <p>它的任务是简单的计算标准输入中的所有 {@code double} 值的平均值和样本标准差。如果标准输入中有 {@code N} 个数字，那么平均值为它们的
 * 和除以 {@code N}，样本标准差为每个值和平均值之差的平方除以 {@code N - 1} 之后的平方根。在这些计算中，数的计算顺序和结果无关，因此可以
 * 将它们保存在一个 {@code Bag} 中并使用 {@code foreach} 语法来计算每个和。
 * <p>注意：不需要保存所有的数也可以计算标准差
 * <p><b>输入/输出：</b></p>
 * <pre>
 *     % java Stats 100 99 101 120 98 107 109 81 101 90
 *
 *     Mean: 100.60
 *     Std dev: 10.51
 * </pre>
 */
public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<Double>();
        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }
        int N = numbers.size();

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
