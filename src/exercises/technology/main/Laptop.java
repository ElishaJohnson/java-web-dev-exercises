package exercises.technology.main;

public class Laptop extends Computer {
    String name;

    public Laptop(String aName, String aOperatingSystem, int aStorageCapacity) {
        super(aOperatingSystem, aStorageCapacity, true);
        this.name = aName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
