package exercises.technology.test;

import exercises.technology.main.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmartphoneTest {
    SmartPhone aSmartphone = new SmartPhone("Black Stallion", "Marshmallow", 64);

    @Test
    public void setsPortable() {
        assertTrue(aSmartphone.isPortable());
    }

    @Test
    public void equalsWorks() {
        assertTrue(aSmartphone.equals(aSmartphone));
        SmartPhone bSmartphone = new SmartPhone("Black Stallion", "Marshmallow", 64);
        assertFalse(aSmartphone.equals(bSmartphone));
    }

    @Test
    public void operatingSystemSet() {
        assertEquals(aSmartphone.getOperatingSystem(), "Marshmallow");
    }
}