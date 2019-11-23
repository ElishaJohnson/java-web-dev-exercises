package exercises.technology.test;

import exercises.technology.main.Laptop;
import static org.junit.Assert.*;
import org.junit.Test;

public class LaptopTest {
    Laptop aLaptop = new Laptop("Pooter", "Windows 10", 1000);

    @Test
    public void setsPortable() {
        assertTrue(aLaptop.isPortable());
    }

    @Test
    public void equalsWorks() {
        assertTrue(aLaptop.equals(aLaptop));
        Laptop bLaptop = new Laptop("Pooter", "Windows 10", 1000);
        assertFalse(aLaptop.equals(bLaptop));
    }

    @Test
    public void operatingSystemSet() {
        assertEquals(aLaptop.getOperatingSystem(), "Windows 10");
    }
}
