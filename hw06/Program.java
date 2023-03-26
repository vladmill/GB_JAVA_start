package seminars.homework.hw06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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

    public static void filter(Scanner in, Set<Laptop> laptops) {
        LinkedHashMap<String,String> parameters = new LinkedHashMap<>();
        parameters.put("1", "Asus, HP Samsung");
        parameters.put("2", "13.5, 14, 15.6");
        parameters.put("3", "1366*768, 1920*1080, 2240*1400");
        parameters.put("4", "Athlon, Core i7, Rizen 7");
        parameters.put("5", "nVidia, AMD, Intel");
        parameters.put("6", "500 Gb, 1 Tb, 1,5 Tb");
        parameters.put("7", "6 Gb, 8 Gb, 16 Gb");
        parameters.put("8", "DOS, Windows, Linux");

        LinkedHashMap<String,String> options = new LinkedHashMap<>();
        
        for (int i = 0; i < parameters.size(); i++) {
            var paramCur = parameters.get(i+1).split(", ");
            
            options.put(""+i+1+"", String.format("1 - %s%n2 - %s%n3 - %s%n ", paramCur[0], paramCur[1], paramCur[2]));
        }

        System.out.print("Введите номер категории: ");
        String f1 = in.nextLine();
        System.out.println(options.get(f1));
        System.out.print("Введите номер значения: ");
        String f2 = in.nextLine();


    }
    public static void main(String[] args) {
        Laptop lt01 = new Laptop(
            "A01B02C03D04E05", "Asus", "15.6", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS");
        Laptop lt02 = new Laptop(
            "B01B02C03D04E05", "HP", "14", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows");
        Laptop lt03 = new Laptop(
            "C01B02C03D04E05", "Samsung", "13.5", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux");
        Laptop lt04 = new Laptop(
            "D01B02C03D04E05", "Asus", "13.5", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows");
        Laptop lt05 = new Laptop(
            "E01B02C03D04E05", "HP", "15.6", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux");
        Laptop lt06 = new Laptop(
            "F01B02C03D04E05", "Samsung", "14", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS");
        Laptop lt07 = new Laptop(
            "G01B02C03D04E05", "Asus", "14", "2240*1400", "Athlon", "Intel", "1,5 Tb", "16 Gb", "Linux");
        Laptop lt08 = new Laptop(
            "H01B02C03D04E05", "HP", "13.5", "1366*768", "Rizen 7", "nVidia", "500 Gb", "6 Gb", "DOS");
        Laptop lt09 = new Laptop(
            "I01B02C03D04E05", "Samsung", "15.6", "1920*1080", "Core i7", "AMD", "1 Tb", "8 Gb", "Windows");

        LinkedHashSet<Laptop> laptops = new LinkedHashSet<>();
        laptops.add(lt01);
        laptops.add(lt02);
        laptops.add(lt03);
        laptops.add(lt04);
        laptops.add(lt05);
        laptops.add(lt06);
        laptops.add(lt07);
        laptops.add(lt08);
        laptops.add(lt09);

        Scanner in = new Scanner(System.in, "cp866");
        filter(in, laptops);
        in.close();

    }
}
