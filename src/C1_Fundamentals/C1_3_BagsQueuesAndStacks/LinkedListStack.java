package C1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * <b>下压堆栈（链表实现）</b>
 * <pre>
 *     % java LinkedListStack < tobe.txt
 * </pre>
 */
public class LinkedListStack<Item> implements Iterable<Item>{
    private Node first; // 栈顶
    private int N;      // 元素数量

    /**
     * 定义结点的嵌套类
     */
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty()    { return first == null; } // or N == 0
    public int size()           { return N; }

    /**
     * 向栈顶添加元素
     */
    public void push(Item item) {
        Node oldlist = first;
        first = new Node();
        first.item = item;
        first.next = oldlist;
        N++;
    }

    /**
     * 从栈顶删除元素
     */
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    /**
     * {@code iterator()} 的实现
     */
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() { return current != null; }
        public void remove() {}
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    /**
     * 测试用例
     */
    public static void main(String[] args) {
        LinkedListStack<String> s = new LinkedListStack<String>();
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
