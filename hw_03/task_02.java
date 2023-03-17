package seminars.homework.hw_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Задан целочисленный список ArrayList. 
    Найти минимальное, максимальное и среднее ариф. из этого списка.
*/

public class task_02 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(-1, 13, 2, 8, 9, 11, 4, 8, 3, 7, -3));
        System.out.println(lst);

        int min = lst.get(0),
                max = lst.get(0);
        float sum = 0;
        for (Integer elem : lst) {
            if (elem < min) {
                min = elem;
            } else if (elem > max) {
                max = elem;
            }
            sum += elem;
        }

        System.out.printf("""
                Минимальное значение: %d
                Максимальное значение: %d
                Среднее арифметическое: %.2f
                """, min, max, sum / lst.size());
    }
}
