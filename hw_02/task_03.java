package seminars.homework.hw_02;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

/*
    К калькулятору из предыдущего дз добавить логирование.
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
        float res = 0;
        boolean flag = true;
        switch (oper) {
            case '+':
                res = (float) a + b;
                break;
            case '-':
                res = (float) a - b;
                break;
            case '*':
                res = (float) a * b;
                break;
            case '/':
                if (b == 0) {
                    System.err.println("Делить на ноль нельзя.");
                    try {
                        writeLog(String.format("%d %c %d = Делить на ноль нельзя.", a, oper, b));
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    flag = false;
                } else {
                    res = (float) a / b; // приведение к float
                }
                break;
            default:
                System.err.println("Введена некорректная операция.");
                try {
                    writeLog(String.format("%d %c %d = Введена некорректная операция.", a, oper, b));
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                flag = false;
                break;
        }
        if (flag) {
            String result = String.format("%d %c %d = %.2f%n", a, oper, b, res);
            System.out.printf(result);
            try {
                writeLog(result);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void writeLog(String str) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/log_calc.txt");

        Logger logger = Logger.getLogger(task_03.class.getName());
        FileHandler logFile = new FileHandler(pathFile, true);
        logger.addHandler(logFile);

        SimpleFormatter sFormat = new SimpleFormatter();
        logFile.setFormatter(sFormat);

        logger.info(str);
    }

}

