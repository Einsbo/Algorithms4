package C1_4_AnalysisOfAlgorithms;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * <b>统计和为 0 的元组的数量</b>
 * <p>作为测试输入，使用的是 1Mints.txt 文件，它的第二个、第八个和第十个元组的和为 0。文件中还有多少组这样的数据？ThreeSum 能够告诉我们
 * 答案，但它所需的时间是可被接受的吗？问题的规模 N 和 ThreeSum 的运行时间有什么关系？
 * <p>在计算机上运行 ThreeSum 并处理 1Kints.txt、 2Kints.txt、4Kints.txt 和 8Kints.txt 文件，它们分别含有 1Mints.txt 中的 1000、
 * 2000、4000 和 8000个整数。
 * <pre>
 *     % java ThreeSum 1Kints.txt
 *     70
 *
 *     % java ThreeSum 2Kints.txt
 *     528
 *
 *     % java ThreeSum 4Kints.txt
 *     4039
 *
 *     % java ThreeSum 8Kints.txt
 *     32074
 * </pre>
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
