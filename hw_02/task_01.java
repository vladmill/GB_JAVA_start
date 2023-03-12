package seminars.homework.hw_02;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

/*
    Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
*/

public class task_01 {
    public static void main(String[] args) throws IOException {

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/log.txt");

        Logger logger = Logger.getLogger(task_01.class.getName());
        FileHandler logFile = new FileHandler(pathFile);
        logger.addHandler(logFile);

        SimpleFormatter sFormat = new SimpleFormatter();
        logFile.setFormatter(sFormat);

        int[] array = { 9, 3, 1, 7, 8, 2, 4, 6, 5 };
        logger.info(Arrays.toString(array));
        boolean flag = false;
        int n = array.length;
        int temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    flag = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                logger.info(Arrays.toString(array));
            }
        }
    }
}
