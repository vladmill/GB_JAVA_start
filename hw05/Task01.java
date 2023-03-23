package seminars.homework.hw05;

import java.io.IOException;

/*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    Добавить функции 1) Добавление номера 2) Вывод всего
    Пример:
    Я ввожу: 1
    К: Введите фамилию
    Я: Иванов
    К: Введите номер
    Я: 1242353
    К: Введите 1) Добавление номера
    2) Вывод всего
    Я ввожу: 1
    К: Введите фамилию
    Я: Иванов
    К: Введите номер
    Я: 547568
    К: Введите 1) Добавление номера
    2) Вывод всего
    Я: 2
    Иванов: 1242353, 547568
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01 {
    public static void choice(Scanner in, Map<String, String> hm) {
        System.out.print("""
                    1 - Добавление номера
                    2 - Вывод всего
                """);
        int ch = in.nextInt();
        in.nextLine();
        if (ch == 1) {
            inputData(in, hm);
        } else if (ch == 2) {
            printData(hm);
        } else {
            System.err.println("Некорректное значение.");
            choice(in, hm);
        }
    }

    public static void inputData(Scanner in, Map<String, String> hm) {
        System.out.print("Введите фамилию: ");
        String ln = in.nextLine();
        System.out.print("Введите телефон: ");
        String fn = in.nextLine();
        if (hm.isEmpty() || !hm.containsKey(ln)) {
            hm.put(ln, fn);
        } else if (hm.containsKey(ln)) {
            hm.put(ln, String.format("%s, %s", hm.get(ln), fn));
        }
        choice(in, hm);
    }

    public static void printData(Map<String, String> hm) {
        for (var item : hm.entrySet()) { // Entry<String, String>
            System.out.printf("%s: %s%n", item.getKey(), item.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, String> hm = new HashMap<>();
        choice(in, hm);
    }
}
