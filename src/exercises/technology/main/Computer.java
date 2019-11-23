package exercises.technology.main;

public class Computer extends AbstractEntity {
    String operatingSystem;
    int storageCapacity;
    boolean portable;

    public Computer(String aOperatingSystem, int aStorageCapacity, boolean aPortable) {
        this.operatingSystem = aOperatingSystem;
        this.storageCapacity = aStorageCapacity;
        this.portable = aPortable;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean isPortable() {
        return portable;
    }

}
