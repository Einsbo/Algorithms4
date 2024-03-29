package C1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * <pre>
 *     % java FixedCapacityStack < tobe.txt
 *     to be not that or be (2 left on stack)
 * </pre>
 */
public class FixedCapacityStack<Item> {
    private Item[] a; // stack entries
    private int N;    // size
    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    public void push(Item item) { a[N++] = item; }
    public Item pop() { return a[--N]; }

    /**
     * 测试用例
     */
    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
