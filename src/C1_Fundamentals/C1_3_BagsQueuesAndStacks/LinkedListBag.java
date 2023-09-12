package C1_3_BagsQueuesAndStacks;

import java.util.Iterator;

public class LinkedListBag<Item> implements Iterable<Item> {
    private Node first; // 链表的首节点
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty()    { return first == null; } // or N == 0
    public int size()           { return N; }
    public void add(Item item) {
        Node oldlist = first;
        first = new Node();
        first.item = item;
        first.next = oldlist;
        N++;
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
}
