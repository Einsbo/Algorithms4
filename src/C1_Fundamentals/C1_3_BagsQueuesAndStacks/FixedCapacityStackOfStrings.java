package C1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * FixedCapacityStackOfStrings 的实例变量由一个保存栈中元素的数组 {@code a[]}，一个用于保存栈中元素数量的整数 {@code N} 组成。要删除
 * 一个元素，我们将 {@code N} 减 1 并返回 {@code a[N]}。要添加一个元素，我们将 {@code a[N]} 设为新元素并将 {@code N} 加 1。这些操作
 * 能够保证如下性质：
 * <ul>
 *     <li>数组中的元素顺序和它们被插入的顺序相同</li>
 *     <li>当 N 为 0 时栈为空</li>
 *     <li>栈的顶部位于 a[N - 1]（如果栈非空）</li>
 * </ul>
 * <pre>
 *     % java FixedCapacityStackOfStrings < tobe.txt
 *     to be not that or be (2 left on stack)
 * </pre>
 */
public class FixedCapacityStackOfStrings {
    private String[] a; // stack entries
    private int N;      // size
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    public void push(String item) { a[N++] = item; }
    public String pop() { return a[--N]; }

    /**
     * 测试用例
     */
    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty())
                StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
