package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hit <ENTER> to exit.");
        while (true) {
            try {
                System.out.println("Enter circle radius:");
                String inputString = input.nextLine();
                if (inputString.toLowerCase().equals("")) {
                    break;
                }
                double radius = Double.parseDouble(inputString);
                if (radius <= 0) {
                    throw new Exception();
                }
                double area = Circle.getArea(radius);
                System.out.print("The area of a circle with radius " + radius + " is " + area + ".\n");
            } catch (Exception ignored) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
