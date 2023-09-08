package C1_2_DataAbstraction;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * <b>对象的数组</b>
 * <p>这段代码模拟掷骰子，它使用了一个 {@code Counter} 对象的数组来记录每种值的出现次数。在 Java 中，对象数组是一个由
 * 对象的引用组成的数组，而非所有对象本身组成的数组。如果对象非常大，那么在移动它们时由于只需要操作引用而非对象本身，这就会
 * 提高效率；如果对象很小，每次获取信息时都需要通过引用反而会降低效率。
 * <p><b>输入/输出:</b></p>
 * <pre>
 *     % java Rolls 1000000
 *     165311 1's
 *     166740 2's
 *     167435 3's
 *     166335 4's
 *     167271 5's
 *     166908 6's
 * </pre>
 */
public class Rolls {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }
        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
