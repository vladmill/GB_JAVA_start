package seminars.homework.hw_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
    Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/
public class task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(13, 2, 8, 9, 11, 4, 8, 3, 6));
        System.out.println(lst);
        
        // for (int i = lst.size() - 1; i >=0 ; i--) {
        //     if(lst.get(i) % 2 == 0){
        //         lst.remove(i);
        //     }
        // }
        // System.out.println(lst);

        Iterator<Integer> itr = lst.iterator();
        while (itr.hasNext()) {
            if(itr.next() % 2 == 0){
                itr.remove();
            }
        }
        System.out.println(lst);
    }
}
