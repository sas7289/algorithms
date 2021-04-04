package lesson_4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyLinledDequeue<T> {

    MyLinkedList<T> mll;

    public MyLinledDequeue() {
        this.mll = new MyLinkedList<>();
    }

    /**
     * Метод добавления нового элемента в конец очереди
     *
     * @param item добавляемый элемент
     */
    public void insertLast(T item) {
        mll.insertFirst(item);
    }


    /**
     * Метод добавления нового элемента в начало очереди
     *
     * @param item добавляемый элемент
     */
    public void insertFirst(T item) {
        mll.insertLast(item);
    }

    /**
     * Метод возвращает первый элемент очереди
     */
    public T peekFront() {
        return mll.getLast();
    }


    /**
     * Метод возвращает последний элемент очереди
     */
    public T peekRear() {
        return mll.getFirst();
    }


    /**
     * Метод удаляет первый элемент очереди
     *
     * @return возвращает первый элемент очереди
     */
    public T removeFirst() {
        T temp = mll.getLast();
        mll.removeLast();
        return temp;
    }


    /**
     * Метод удаляет последний элемент очереди
     *
     * @return возвращает последний элемент очереди
     */
    public T removeLast() {
        T temp = mll.getFirst();
        mll.removeFirst();
        return temp;
    }


    /**
     * Метод определяет размер очереди (количество элементов)
     *
     * @return возвращает размер (int size)
     */
    public int size() {
        return mll.size();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        ListIterator<T> iter = mll.listiterator();
        while (iter.hasNext()) {
            sb.append(iter.next()).append(", ");
        }
        if (mll.size() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" ]");
        return sb.toString();
    }
}
