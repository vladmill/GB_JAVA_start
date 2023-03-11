package seminars.homework.hw_01;

/* Вывести все простые числа от 1 до 1000 */

public class task_02 {
    public static void main(String[] args) {
        int n = 1000;
        Boolean flag;
        for (int i = 2; i <= n; i = i > 2 ? i + 2 : i + 1) {    // нет смысла проверять четные числа кроме 2
            flag = true;
            for (int j = 3; j < i; j += 2) {                    // так же как и делить на четные
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.printf("%d ", i);
            }
        }
    }
}
