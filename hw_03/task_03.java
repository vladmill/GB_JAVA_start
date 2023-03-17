package seminars.homework.hw_03;

import java.util.Arrays;

/*
    Реализовать алгоритм сортировки слиянием
*/

public class task_03 {

    public static int[] sortMerge(int[] array) {
        int l = array.length;
        if (l > 1) {
            int m = array.length / 2;
            int[] arrayLeft = new int[m];
            System.arraycopy(array, 0, arrayLeft, 0, m);
            int[] arrayRight = new int[l - m];
            System.arraycopy(array, m, arrayRight, 0, l - m);
            arrayLeft = sortMerge(arrayLeft);
            arrayRight = sortMerge(arrayRight);

            int i = 0,
                    j = 0,
                    k = 0;
            while (i < arrayLeft.length && j < arrayRight.length) {
                if (arrayLeft[i] < arrayRight[j]) {
                    array[k] = arrayLeft[i];
                    i += 1;
                } else {
                    array[k] = arrayRight[j];
                    j += 1;
                }
                k += 1;
            }
            while (i < arrayLeft.length) {
                array[k] = arrayLeft[i];
                i += 1;
                k += 1;
            }
            while (j < arrayRight.length) {
                array[k] = arrayRight[j];
                j += 1;
                k += 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 13, 4, 9, 1, 17, 5, 1, 3, 6, 4, 3, 8, 9 };
        System.out.printf("Несортированный массив:\t %s %n", Arrays.toString(array));
        sortMerge(array);
        System.out.printf("Отсорированный массив:\t %s %n", Arrays.toString(array));
    }
}
