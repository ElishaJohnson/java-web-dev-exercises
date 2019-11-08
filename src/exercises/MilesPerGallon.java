package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        double miles = input.nextDouble();
        System.out.println(("Enter number of gallons consumed:"));
        double gallons = input.nextDouble();
        System.out.println("You have been traveling at a rate of " + Double.toString(miles/gallons) + " miles per gallon.");
    }
}
