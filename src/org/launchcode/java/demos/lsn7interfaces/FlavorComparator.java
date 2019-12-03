package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        int allergens1 = o1.getAllergens().size();
        int allergens2 = o2.getAllergens().size();
        if (allergens1 > allergens2) {
            return -1;
        } else if (allergens1 < allergens2) {
            return 1;
        } else {
            return 0;
        }
    }
}
