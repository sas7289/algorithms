package lesson_4;

import java.util.ListIterator;

public class MyLinkedQueue<T> {
    MyLinkedList<T> ll;

    public MyLinkedQueue() {
        ll = new MyLinkedList<>();
    }

    public void insert(T item) throws IllegalStateException {
        ll.insertFirst(item);
    }

    public T peekFront() {
        return ll.getLast();
    }

    public T remove() {
        return ll.removeLast();
    }

    public int size() {
        return ll.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        ListIterator<T> iter = ll.listiterator();
        while (iter.hasNext()) {
            sb.append(iter.next()).append(", ");
        }
        if (ll.size() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
