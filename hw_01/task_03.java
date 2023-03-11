package seminars.homework.hw_01;

import java.util.Scanner;

/*
    Реализовать простой калькулятор (+ - / *)
    Ввод числа ->
    Ввод знака ->
    Ввод числа ->
*/

public class task_03 {
    public static void main(String[] args) {
        System.out.println("\nКалькулятор поддерживает следующие операции:\n" +
                "сложение: +\n" +
                "вычитание: -\n" +
                "умножение: *\n" +
                "деление: /\n");

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = iScanner.nextInt();
        System.out.print("Операция: ");
        char oper = iScanner.next().charAt(0);
        System.out.print("Второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        float res = 0; // float для деления
        boolean flag = true;
        switch (oper) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.err.println("Делить на ноль нельзя.");
                    flag = false;
                } else {
                    res = (float) a / b; // приведение к float
                }
                break;
            default:
                System.err.println("Введена некорректная операция.");
                flag = false;
                break;
        }
        if (flag) {
            System.out.printf("%d %c %d = %.2f%n", a, oper, b, res);
        }

    }
}
