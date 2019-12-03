package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        Ingredient.listItems(flavors);
        Ingredient.listItems(cones);
    }
}
