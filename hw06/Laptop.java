package seminars.homework.hw06;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Laptop {
    private String sn;
    private String brand;
    private String displayDiagonal;
    private String displayResolution;
    private String cpu;
    private String videoCard;
    private String hdd;
    private String ram;
    private String operatingSystem;

    public Laptop(String sn, String brand, String displayDiagonal, String displayResolution, String cpu, String videoCard, String hdd, String ram, String operatingSystem){
        this.sn = sn;
        this.brand = brand;
        this.displayDiagonal = displayDiagonal;
        this.displayResolution = displayResolution;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    // get
    public String getSn() {
        return sn;
    }
    public String getBrand() {
        return brand;
    }
    public String getDisplayDiagonal() {
        return displayDiagonal;
    }
    public String getDisplayResolution() {
        return displayResolution;
    }
    public String getCpu() {
        return cpu;
    }
    public String getVideoCard() {
        return videoCard;
    }
    public String getHdd() {
        return hdd;
    }
    public String getRam() {
        return ram;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getField(String i){
        String result;
        switch (i) {
            case "0":
                result = this.getSn();
            break;
            case "1":
                result = this.getBrand();
                break;
            case "2":
                result = this.getDisplayDiagonal();
                break;
            case "3":
                result = this.getDisplayResolution(); 
                break;
            case "4":
                result = this.getCpu();  
                break;
            case "5":
                result = this.getVideoCard();
                break;
            case "6":
                result = this.getHdd();
                break;
            case "7":
                result = this.getRam();
                break;
            case "8":
                result = this.getOperatingSystem();
                break;
            default:
                result = null;
                break;
        }
        return result;
    }

    public static List<String> getParametersName(){
        return new ArrayList<>(Arrays.asList(
            "Серийный номер", 
            "Бренд", 
            "Диагональ экрана", 
            "Разрешение экрана", 
            "Процессор",
            "Видеокарта", 
            "Объем жесткого диска", 
            "Размер оперативной памяти", 
            "Операционная система"
        ));
    }

    @Override
    public String toString() {
        return String.format(
            """
            Серийный номер:         %s
            Бренд:                  %s
            Диагональ экрана:       %s
            Разрешение экрана:      %s
            Процессор:              %s
            Видеокарта:             %s
            Объеём жесткого диска:  %s
            перативной памяти:      %s
            Операционная система:   %s
            """, 
            this.sn,
            this.brand,
            this.displayDiagonal,
            this.displayResolution,
            this.cpu,
            this.videoCard,
            this.hdd,
            this.ram,
            this.operatingSystem);
    }

}
