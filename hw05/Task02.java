package seminars.homework.hw05;

import java.util.*;

/*
    Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов

    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности Имени.
*/
public class Task02 {

    public static Map<String, Integer> writeMap(List<String> lst) {
        Map<String, Integer> lhm = new LinkedHashMap<>();
        for (String string : lst) {
            String name = string.split(" ")[0];
            if (lhm.isEmpty() || !lhm.containsKey(name)) {
                lhm.put(name, 1);
            } else if (lhm.containsKey(name)) {
                lhm.put(name, lhm.get(name) + 1);
            }
        }
        return lhm;
    }

    public static Map<String, Integer> sortValMap(Map<String, Integer> lhm) {
        Map<String, Integer> sortMap = new LinkedHashMap<>();
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(lhm.values());
        lst.sort(Comparator.reverseOrder());
        for (int i = 0; i < lst.size(); i++) {
            int val = lst.get(i);
            for (var item : lhm.entrySet()) {
                if (item.getValue() == val) {
                    sortMap.put(item.getKey(), item.getValue());
                }
            }
        }
        return sortMap;
    }

    public static void printRating(Map<String, Integer> map) {
        System.out.println("Имена по убыванию популярности:");
        for (var item : map.entrySet()) {
            System.out.printf("%s - %d%n", item.getKey(), item.getValue());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        System.out.printf("Начальный список:%n%s%n%n", lst);
        Map<String, Integer> lhm = writeMap(lst);
        System.out.printf("Коллекция имен:%n%s%n%n", lhm);
        printRating(sortValMap(lhm));
    }
}
