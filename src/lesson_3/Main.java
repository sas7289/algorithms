package lesson_3;


public class Main {
    public static void main(String[] args) {
        MyDequeue<Integer> mdq = new MyDequeue<>();
        int i = 0;
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertLeft(i++);
        System.out.println(mdq);
        mdq.removeLeft();
        System.out.println(mdq);
        mdq.removeLeft();
        System.out.println(mdq);
        mdq.removeRight();
        System.out.println(mdq);
        mdq.removeRight();
        System.out.println(mdq);
        mdq.removeLeft();
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);
        mdq.insertRight(i++);
        System.out.println(mdq);


        System.out.println(stringReverse("Циклопентанпергидрофенантрен"));
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder();
        int countCh = str.length();
        MyStack<Character> myStack = new MyStack<>();
        for (int i = 0; i < countCh; i++) {
            myStack.push(str.charAt(i));
        }
        for (int i = 0; i < countCh; i++) {
            sb.append(myStack.pop());
        }
        return sb.toString();
    }
}
