package seminars.homework.hw04;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
    Пусть дан LinkedList с несколькими элементами. 
    Реализуйте метод(не void), который вернет “перевернутый” список.
*/

public class Task01 {
    public static List<Integer> reverseListL(List<Integer> lstL) {
        int size = lstL.size();
        for (int i = 0; i < size / 2; i++) {
            Collections.swap(lstL, i, size - 1 - i);
        }
        return lstL;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lstL = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(lstL);
        System.out.println(reverseListL(lstL));
    }
}
