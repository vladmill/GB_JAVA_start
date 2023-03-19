package seminars.homework.hw04;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/*
    В калькулятор добавьте возможность отменить последнюю операцию.
*/

public class Task03 {

    public static void calc(Scanner in, Stack<Double> stack) {
        double result = 0,
                a = 0,
                b = 0;
        String oper = "",
                out = "";
        boolean flag = true;
        if (stack.isEmpty()) {
            System.out.print("Первое число: ");
            a = in.nextDouble();
        } else {
            a = stack.peek();
            System.out.printf("Первое число: %.1f%n", a);
        }
        System.out.print("Операция: ");
        oper = in.next();
        if ("отмена".equalsIgnoreCase(oper)) {
            stack.pop();
            calc(in, stack);
        }
        System.out.print("Второе число: ");
        b = in.nextDouble();

        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    out = "Делить на ноль нельзя.%n";
                    flag = false;
                } else {
                    result = a / b;
                }
                break;
            default:
                out = "Введена некорректная операция.%n";
                flag = false;
                break;
        }
        if (flag) {
            out = String.format("%.1f %s %.1f = %.1f%n%n", a, oper, b, result);
            stack.push(result);
        }
        System.out.printf(out);
        calc(in, stack);
    }

    public static void main(String[] args) {
        System.out.println(
                """
                    Калькулятор поддерживает следующие операции:
                    сложение: +
                    вычитание: -
                    умножение: *
                    деление: /
                    Продолжает работу с ранее полученным результатом, с возможностью его каскадной отмены (операция: отмена)
                """);
        Scanner in = new Scanner(System.in, "cp866");
        Stack<Double> stack = new Stack<>();
        calc(in, stack);
    }
}
