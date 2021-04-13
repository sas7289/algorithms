package lesson_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(recPower(2, -3));

        List<Thing> list = new LinkedList<>(Arrays.asList(new Thing(1,2),new Thing(2,3),
                new Thing(5,1),new Thing(3,7),new Thing(9,11),new Thing(5,8)));
        ListIterator<Thing> iterator = list.listIterator();
        ArrayList<ArrayList<Thing>> startedList = new ArrayList<>();
        ArrayList<Thing> things = fillBag(iterator, startedList, 15);

        int i = 0;
        for (Thing thing : things) {
            System.out.printf("№%d size: %d, cost: %d\n", ++i, thing.getSize(), thing.getCost());
        }

    }

    //Метод поиска максимальной стоимости содержимого рюкзака
    public static ArrayList<Thing> fillBag(ListIterator<Thing> iterator, ArrayList<ArrayList<Thing>> prevItemArr, int maxSize) {
        if (prevItemArr.size() == 0) {
            for (int i = 0; i < 15; i++) {
                prevItemArr.add(new ArrayList<>(Arrays.asList(new Thing())));
            }
            return fillBag(iterator, prevItemArr, maxSize);
        }
        if (!iterator.hasNext()) {
            return prevItemArr.get(prevItemArr.size() - 1);
        }
        Thing tempItem = iterator.next();
        ArrayList<ArrayList<Thing>> currentRow = new ArrayList<>(maxSize);
        for (int i = 0; i < maxSize; i++) {
            if(tempItem.getSize() <= i && tempItem.getCost() > getSumOfCost(prevItemArr.get(i))) {
                ArrayList<Thing> added = new ArrayList<>();
                added.addAll((i - tempItem.getSize()) > 0 ? prevItemArr.get(i - tempItem.getSize()) : new ArrayList<>());
                currentRow.add(added);
                currentRow.get(i).add(tempItem);
            } else {
                currentRow.add(i, prevItemArr.get(i));
            }
        }
        return fillBag(iterator, currentRow, maxSize);
    }

    //Метод находит общую стоимость вещей в списке
    private static int getSumOfCost(ArrayList<Thing> items) {
        int sum = 0;
        for (Thing item : items) {
            sum += item.getCost();
        }
        return sum;
    }

    //Рекурсивное возведение в степень
    public static double recPower(double a, double b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (b < 0) {
            a = 1 / a;
            b = Math.abs(b);
        }
        return recPower(a, b - 1) * a;
    }


    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int recFact(int n) {
        if (n == 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static long fibo(long n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(long n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }

        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static long triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }

    public static int recMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultiply(a, b - 1) + a;
    }

}
