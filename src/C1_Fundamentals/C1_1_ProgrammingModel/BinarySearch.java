import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// 导入一个 Java 库
import java.util.Arrays;

/**
 * 要执行一个 Java 程序，首先需要用 javac 命令编译它，然后再用 java 命令运行它。
 * <p>下面代码第一行生成一个 BinarySearch.class 的文件，其中包含本程序的 Java 字节码，第二行将 LargeW.txt 作为参数传给 main，并重定向
 * 输入至 LargeT.txt
 * <pre>
 *     javac BinarySearch.java
 *     java BinarySearch largeW.txt < largeT.txt
 * </pre>
 * 代码文件名必须是 BinarySearch，与下面的 class 相同
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) hi = mid + 1;
            else                   return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);
            }
        }
    }
}
