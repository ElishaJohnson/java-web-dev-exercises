package org.launchcode.java.demos.lsn7interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class Ingredient {
    private String name;
    private double cost;
    private ArrayList<String> allergens;

    public Ingredient(String aName, double aCost, ArrayList<String> someAllergens){
        name = aName;
        cost = aCost;
        allergens = someAllergens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        DecimalFormat df2 = new DecimalFormat("0.00");
        return name + " ... $" + df2.format(cost) + " ... " +
                "Allergens: " + allergens;
    }

    public static void listItems(ArrayList items) {
        Class classType = items.get(0).getClass();
        System.out.println("\n" + classType.getSimpleName().toUpperCase() + "S:");
        for (Object flavor : items) {
            System.out.println(flavor.toString());
        }
    }
}
