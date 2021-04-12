package lesson_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.addFirst("one");
//        linkedList.addFirst("two");
//        linkedList.addFirst("three");
//        linkedList.addFirst("four");
//        linkedList.addFirst("five");
//        linkedList.addFirst("six");
//        linkedList.addFirst("seven");
//        ListIterator<String> listIterator = linkedList.listIterator();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        listIterator.next();
//        listIterator.next();
//        listIterator.next();
//        listIterator.next();
//        listIterator.next();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        System.out.println(linkedList);
//        listIterator.previous();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        System.out.println(linkedList);
//        listIterator.remove();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        System.out.println(linkedList);
//        listIterator.previous();
//        listIterator.remove();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        System.out.println(linkedList);
//        listIterator.next();
//        listIterator.next();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        listIterator.remove();
//
//        System.out.println(linkedList);
//        System.out.println(listIterator.previous());
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//
//        listIterator.remove();
//        System.out.println("index prev: " + listIterator.previousIndex() + " index next: " + listIterator.nextIndex());
//        System.out.println(linkedList);



        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertLast("zero");
        mll.insertLast("one");
        mll.insertLast("two");
        mll.insertLast("three");
        mll.insertLast("four");
        mll.insertLast("five");
        mll.insertLast("six");
        mll.insertLast("seven");
        ListIterator<String> li = mll.listiterator();

        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());
        System.out.println(li.previous());
//        System.out.println(li.previous());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.previous();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.previous();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.previous();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());

        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        li.remove();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.previous();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.remove();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        li.remove();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);

        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());

        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);

        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.next();        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.next();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.next();
        System.out.println(mll);
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(li.previous());
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.remove();
        System.out.println(mll);

//        li.remove();


        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.next();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.next();

        System.out.println(mll);
        li.add("NEW");
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.add("NEW2");
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.remove();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println("after remove: " + mll);
        li.remove();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println("after remove: " + mll);
        li.next();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.next();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        li.previous();
        li.remove();
        System.out.println("index prev: " + li.previousIndex() + " index next: " + li.nextIndex());
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);
        li.remove();
        System.out.println(mll);


//        MyLinledDequeue<String> mql = new MyLinledDequeue<>();
//        System.out.println(mql.size());
//        mql.insertFirst("one");
//        System.out.println(mql);
//        System.out.println("front: " + mql.peekFront());
//        mql.insertFirst("two");
//        System.out.println(mql);
//        System.out.println("rear: " + mql.peekRear());
//        mql.insertLast("three");
//        System.out.println(mql);
//        System.out.println("size: " + mql.size());
//        mql.insertLast("four");
//        System.out.println(mql);
//        mql.insertFirst("five");
//        System.out.println(mql);
//        mql.insertFirst("six");
//        System.out.println(mql);
//        mql.insertLast("seven");
//        System.out.println(mql);
//        System.out.println("rear: " + mql.peekRear());
//        System.out.println("front: " + mql.peekFront());
//        System.out.println("size: " + mql.size());
//        mql.removeLast();
//        System.out.println(mql);
//        mql.removeFirst();
//        System.out.println(mql);
//        System.out.println("front: " + mql.peekFront());
//        System.out.println("size: " + mql.size());
//        mql.insertLast("eight");
//        System.out.println(mql);
//        System.out.println("front: " + mql.peekFront());
//        System.out.println("size: " + mql.size());

    }
}
