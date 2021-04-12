package lesson_3;

import java.util.NoSuchElementException;

public class MyDequeue<T> {
    private T[] list;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    private final double RATE = 1.5; //коэффициент увеличения массива
    private int begin;
    private int end;

    public MyDequeue(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDequeue() {
        this(DEFAULT_CAPACITY);
    }


    /**
     * Метод добавления нового элемента в конец очереди
     *
     * @param item добавляемый элемент
     */
    public void insertRight(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * RATE));
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }


    /**
     * Метод добавления нового элемента в начало очереди
     *
     * @param item добавляемый элемент
     */
    public void insertLeft(T item) {
        if (isFull()) {
            reCapacity((int) (capacity * RATE));
        }
        size++;
        begin = prevIndex(begin);
        list[begin] = item;
    }


    /**
     * Метод возвращает первый элемент очереди
     */
    public T peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }


    /**
     * Метод возвращает последний элемент очереди
     */
    public T peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[prevIndex(end)];
    }


    /**
     * Метод удаляет первый элемент очереди
     *
     * @return возвращает первый элемент очереди
     */
    public T removeLeft() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }


    /**
     * Метод удаляет последний элемент очереди
     *
     * @return возвращает последний элемент очереди
     */
    public T removeRight() {
        T temp = peekRear();
        size--;
        end = prevIndex(end);
        if(begin != end) list[end] = null;
        return temp;
    }


    /**
     * Метод определяет достигла ли очередь максимального размера
     *
     * @return возвращает true, если максимальный размер достигнут
     */
    public boolean isFull() {
        return size == list.length;
    }


    /**
     * Метод определяет отсутствуют ли в очереди элементы
     *
     * @return возвращает true, если элементов нет
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Метод определяет размер очереди (количество элементов)
     *
     * @return возвращает размер (int size)
     */
    public int size() {
        return size;
    }


    /**
     * Метод определяет индекс следующего за последним элемента очереди
     *
     * @param index индекс элемента, относительно которого требуется индекс следующего элемента
     * @return возвращает индекс
     */
    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }


    /**
     * Метод определяет индекс предыдущего перед первым элементом очереди
     *
     * @param index индекс элемента, относительно которого требуется индекс предыдущего элемента
     * @return возвращает индекс
     */
    private int prevIndex(int index) {
        return (index - 1 + list.length) % list.length;
    }


    /**
     * Метод увеличивает размер массива очереди в случае если размер очереди достигает размеров массива
     *
     * @param newCapacity новый размер массива
     */
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
