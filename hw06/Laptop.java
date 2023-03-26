package seminars.homework.hw06;

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

    @Override
    public String toString() {
        return String.format("SN: %s", this.sn);
    }
}
