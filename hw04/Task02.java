package seminars.homework.hw04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
*/

public class Task02 {
    public static List<Integer> enqueue(List<Integer> lst, int a) {
        ((LinkedList<Integer>) lst).addLast(a);
        return lst;
    }

    public static int dequeue(List<Integer> lst) {
        int result = ((LinkedList<Integer>) lst).getFirst();
        ((LinkedList<Integer>) lst).removeFirst();
        return result;
    }

    public static int first(List<Integer> lst) {
        return ((LinkedList<Integer>) lst).getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.printf("Начальный список => %s%n", list);
        System.out.printf("Метод enqueue(list, 8) => %s%n", enqueue(list, 8));
        System.out.printf("Метод dequeue(list) => %s %s%n", dequeue(list), list);
        System.out.printf("Метод first(list) => %s %s%n", first(list), list);

    }
}
