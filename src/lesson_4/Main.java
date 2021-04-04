package lesson_4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
//        mll.insertFirst("one");
//        mll.insertFirst("two");
//        mll.insertFirst("three");
//        mll.insertFirst("four");
//        mll.insertFirst("five");
//        mll.insertFirst("six");
//        mll.insertFirst("seven");
//
//        ListIterator<String> li = mll.listiterator();
//
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        li.next();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        li.next();
//
//        System.out.println(mll);
//        li.add("NEW");
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println(mll);
//        li.add("NEW2");
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println(mll);
//        li.remove();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println("after remove: " + mll);
//        li.remove();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println("after remove: " + mll);
//        li.next();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println(mll);
//        li.next();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        li.remove();
//        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
//        System.out.println(mll);


        MyDequeueOnList<String> mql = new MyDequeueOnList<>();
        System.out.println(mql.size());
        mql.insertFirst("one");
        System.out.println(mql);
        System.out.println("front: " + mql.peekFront());
        mql.insertFirst("two");
        System.out.println(mql);
        System.out.println("rear: " + mql.peekRear());
        mql.insertLast("three");
        System.out.println(mql);
        System.out.println("size: " + mql.size());
        mql.insertLast("four");
        System.out.println(mql);
        mql.insertFirst("five");
        System.out.println(mql);
        mql.insertFirst("six");
        System.out.println(mql);
        mql.insertLast("seven");
        System.out.println(mql);
        System.out.println("rear: " + mql.peekRear());
        System.out.println("front: " + mql.peekFront());
        System.out.println("size: " + mql.size());
        mql.removeRight();
        System.out.println(mql);
        mql.removeLeft();
        System.out.println(mql);
        System.out.println("front: " + mql.peekFront());
        System.out.println("size: " + mql.size());
        mql.insertLast("eight");
        System.out.println(mql);
        System.out.println("front: " + mql.peekFront());
        System.out.println("size: " + mql.size());

    }
}
