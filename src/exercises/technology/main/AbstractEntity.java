package exercises.technology.main;

import java.util.Objects;

public abstract class AbstractEntity {
    private static int newId = 1;
    private int id;

    AbstractEntity() {
        this.id = newId;
        newId++;
    }

    public int getId() {
        return this.id;
    }

}
