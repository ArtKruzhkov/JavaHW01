import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a collection of laptops
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Laptop 1", 8, 512, "Windows", "Black"));
        laptops.add(new Laptop("Laptop 2", 16, 1024, "MacOS", "Silver"));
        laptops.add(new Laptop("Laptop 3", 4, 256, "Linux", "Blue"));

        // Print all laptops before filtering
        System.out.println("All laptops:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

        // Run the method for filtering laptops
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filter = new HashMap<>();
        System.out.println("Enter filter criteria:");
        System.out.println("Enter minimum RAM size:");
        int minRamSize = scanner.nextInt();
        System.out.println("Enter minimum HDD size:");
        int minHddSize = scanner.nextInt();
        filter.put("minRamSize", minRamSize);
        filter.put("minHddSize", minHddSize);

        List<Laptop> filteredLaptops = LaptopFilter.filterLaptops(laptops, filter);

        // Print filtered laptops
        System.out.println("Filtered laptops:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}

class Laptop {
    private String model;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;

    // Constructor
    public Laptop(String model, int ramSize, int hddSize, String os, String color) {
        this.model = model;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return model;
    }


    public String getModel() {
        return model;
    }

    public void setМодель(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setОбъемЖД(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOS() {
        return os;
    }

    public void setОперационнаяСистема(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setЦвет(String color) {
        this.color = color;
    }
}

class LaptopFilter {
    public static List<Laptop> filterLaptops(List<Laptop> laptops, Map<String, Object> filter) {
        int minRamSize = (int) filter.getOrDefault("minRamSize", 0);
        int minHddSize = (int) filter.getOrDefault("minHddSize", 0);

        List<Laptop> result = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() >= minRamSize && laptop.getHddSize() >= minHddSize) {
                result.add(laptop);
            }
        }
        return result;
    }
}