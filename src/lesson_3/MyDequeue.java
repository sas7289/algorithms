package lesson_3;

import java.util.NoSuchElementException;

public class MyDequeue<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //b
    //  e
    //8


    public MyDequeue(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDequeue() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    /**
     * Метод добавления в очередь нового элемента
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertRight(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }
    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[prevIndex(end)];
    }

    public T removeLeft() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        T temp = peekRear();
        size--;
        end = prevIndex(end);
        if(begin != end) list[end] = null;
        return temp;
    }


    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        return (index - 1 + list.length) % list.length;
    }


    private void reCapacity(int newCapacity) {
        this.capacity = (int) (newCapacity);
        T[] temp = (T[]) new Object[newCapacity];
        System.arraycopy(list, begin, temp, 0, list.length - begin);
        if(end != list.length - 1) {
            System.arraycopy(list, 0, temp, list.length - begin, end + 1);
        }
        list = temp;
        begin = 0;
        end = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        int index = begin;
        for (int i = 0; i < list.length; i ++) {
            if(list[index] == null) break;
            sb.append(list[index]).append(", ");
            index = nextIndex(index);
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
            sb.append(" size: " + size);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
