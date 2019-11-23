package exercises.technology.test;

import exercises.technology.main.AbstractEntity;
import exercises.technology.main.Computer;
import static org.junit.Assert.*;
import org.junit.Test;

public class ComputerTest {
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void computerAssignsId() {
        Computer aComputer = new Computer("DOS", 500, false);
        assertEquals(aComputer.getId(), 1);
    }

    @Test
    public void equalsWorks() {
        Computer a = new Computer("iOS", 1000, true);
        Computer b = new Computer("iOS", 1000, true);
        assertFalse(a.equals(b));
        assertTrue(a.equals(a));
    }
}
