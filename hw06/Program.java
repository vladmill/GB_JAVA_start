package seminars.homework.hw06;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
    NoteBook notebook1 = new NoteBook
    NoteBook notebook2 = new NoteBook
    NoteBook notebook3 = new NoteBook
    NoteBook notebook4 = new NoteBook
    NoteBook notebook5 = new NoteBook

    Например: “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    Класс сделать в отдельном файле

    приветствие
    Выбор параметра
    выбор конкретнее
    вывод подходящих
*/

public class Program {
    public static void printResult(Set<Laptop> laptops, String f1, String val) {
        System.out.println("\nВам подходят:");
        for (Laptop item : laptops) {
            if (val.equals(item.getField(f1))) {
                System.out.println(item);
            }
        }
    }

    public static List<String> getValue(Set<Laptop> laptops, String f1) {
        Set<String> temp = new HashSet<>();
        for (Laptop item : laptops) {
            temp.add(item.getField(f1));
        }
        List<String> paramValue = new ArrayList<>();
        paramValue.addAll(temp);
        return paramValue;
    }

    public static void filter(Scanner in, Set<Laptop> laptops) {
        List<String> paramName = Laptop.getParametersName();
        for (int i = 1; i < paramName.size(); i++) {
            System.out.printf("%d - %s%n", i, paramName.get(i));
        }
        System.out.print("Введите номер категории: ");
        String f1 = in.nextLine();
        List<String> lstVal = getValue(laptops, f1);
        for (int i = 0; i < lstVal.size(); i++) {
            System.out.printf("%d - %s%n", i + 1, lstVal.get(i));
        }
        System.out.print("Введите номер значения: ");
        int f2 = in.nextInt() - 1;
        printResult(laptops, f1, lstVal.get(f2));
    }

    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(
                "A01B02C03D04E05", "Asus", "15.6", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS"));
        laptops.add(new Laptop(
                "B01B02C03D04E05", "HP", "14", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows"));
        laptops.add(new Laptop(
                "C01B02C03D04E05", "Samsung", "13.5", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux"));
        laptops.add(new Laptop(
                "D01B02C03D04E05", "Asus", "13.5", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows"));
        laptops.add(new Laptop(
                "E01B02C03D04E05", "HP", "15.6", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux"));
        laptops.add(new Laptop(
                "F01B02C03D04E05", "Samsung", "14", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS"));
        laptops.add(new Laptop(
                "G01B02C03D04E05", "Asus", "14", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux"));
        laptops.add(new Laptop(
                "H01B02C03D04E05", "HP", "13.5", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS"));
        laptops.add(new Laptop(
                "I01B02C03D04E05", "Samsung", "15.6", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows"));

        Scanner in = new Scanner(System.in, "cp866");
        filter(in, laptops);
        in.close();
    }
}
