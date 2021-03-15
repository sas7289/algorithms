package lesson_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> mal = getRandMyArrayLIst(100000);
        long begin = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Bubble: " + (System.currentTimeMillis() - begin));

        mal = getRandMyArrayLIst(100000);
        begin = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("InsertSort: " + (System.currentTimeMillis() - begin));

        mal = getRandMyArrayLIst(100000);
        begin = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("SelectionSort: " + (System.currentTimeMillis() - begin));


    }

    public static MyArrayList<Integer> getRandMyArrayLIst(int size) {
        Random r = new Random();
        MyArrayList<Integer> temp = new MyArrayList<>(size);
        for (int i = 0; i < size; i++) {
            temp.add(r.nextInt());
        }
        return temp;
    }
}
