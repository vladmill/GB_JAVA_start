package seminars.homework.hw_01;

import java.util.Scanner;

/* 
    Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
    Ввод:5
    Треугольное число 1 + 2 + 3 + 4 + 5 = 15
    n! 1 * 2 * 3 * 4 * 5 = 120
*/

public class task_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int t = 1;
        int f = 1;
        for (int i = 2; i <= n; i++) {
            t += i;
            f *= i;
        }
        System.out.printf("Треугольное число %d = %d %nФакториал %d = %d ", n, t, n, f);
    }
}
