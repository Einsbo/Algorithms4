package C1_3_BagsQueuesAndStacks;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * <b>先进先出队列</b>
 * <pre>
 *     % java LinkedListQueue < tobe.txt
 * </pre>
 */
public class LinkedListQueue<Item> implements Iterable<Item> {
    private Node first; // 指向最早添加的结点链接
    private Node last;  // 指向最近添加的结点链接
    private int N;      // 队列中的元素数量

    /**
     * 定义结点的嵌套类
     */
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() { return first == null; } // or N == 0
    public int size() { return N; }

    /**
     * 向表尾插入元素
     */
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else            oldlast.next = last;
        N++;
    }

    /**
     * 从表头删除元素
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }
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
     * 创建一个队列并操作字符串入列或出列
     */
    public static void main(String[] args) {
        LinkedListQueue<String> q = new LinkedListQueue<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                q.enqueue(item);
            else if (!q.isEmpty())
                StdOut.print(q.dequeue() + " ");
        }
        StdOut.println("(" + q.size() + " left on queue)");
    }
}
