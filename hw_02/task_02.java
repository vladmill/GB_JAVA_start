package seminars.homework.hw_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
    Дана строка (получение через обычный текстовый файл!!!)

    "фамилия":"Иванов","оценка":"5","предмет":"Математика"
    "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

    Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
    Студент [фамилия] получил [оценка] по предмету [предмет].

    Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
*/

public class task_02 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            
            File file = new File(pathFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                printStr(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Что-то пошло не так.");
        }
    }

    public static void printStr(String str) {
        String[] arr = str.split(",");
        String val = "";
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                val = arr[i].split(":")[1].replace("\"", "");
                switch (i){
                    case 0:
                        result.append("Студент\s").append(val+"\s");
                        break;
                    case 1:
                        result.append("получил\s").append(val+"\s");
                        break;
                    case 2:
                        result.append("по предмету\s").append(val+"\s");
                        break;
                }
            }
            System.out.println(result);
    }
}
