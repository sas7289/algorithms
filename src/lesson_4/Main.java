package lesson_4;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertFirst("two");
        mll.insertFirst("three");
        mll.insertFirst("four");
        mll.insertFirst("five");
        mll.insertFirst("six");
        mll.insertFirst("seven");

        ListIterator<String> li = mll.listiterator();
//        System.out.println(li.previousIndex());

        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        li.next();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        li.next();
//        System.out.println(li.previousIndex()
//                + " " + li.nextIndex()
//                + " " + li.previousIndex()
//                + " " + li.nextIndex()
//                + " " + li.next());
        System.out.println(mll);
        li.add("NEW");
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println(mll);
        li.add("NEW2");
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println(mll);
        li.remove();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println("after remove: " + mll);
        li.remove();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println("after remove: " + mll);
        li.next();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println(mll);
        li.next();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        li.remove();
        System.out.println("index prev :" + li.previousIndex() + "index next :" + li.nextIndex());
        System.out.println(mll);

//        while(li.hasNext()){
//            System.out.println(li.next());
//        }
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//        }
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//        }

    }
}
