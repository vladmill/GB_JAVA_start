package seminars.homework.hw_01;

import java.util.Scanner;

/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
Ввод: 2? + ?5 = 69
Вывод: 24 + 45 = 69
*/

public class task_04 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите уравнение вида q + w = e: ");
        String[] elem = iScanner.nextLine().split(" ");
        iScanner.close();
        boolean flag = true;
        int e = Integer.parseInt(elem[4]);
        int i = 0;
        while (i < 10 && flag) {
            int q = Integer.parseInt(elem[0].replace("?", "" + i + ""));
            int w = Integer.parseInt(elem[2].replace("?", "" + i + ""));
            if (q + w == e) {
                flag = false;
                System.out.printf("%d + %d = %d", q, w, e);
            }
            i += 1;
        }
        if (flag) {
            System.out.println("Решения нет.");
        }
    }
}
