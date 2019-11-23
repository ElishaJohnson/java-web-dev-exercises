package exercises.technology.main;

public class SmartPhone extends Computer {
    String name;

    public SmartPhone(String name, String aOperatingSystem, int aStorageCapacity) {
        super(aOperatingSystem, aStorageCapacity, true);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
