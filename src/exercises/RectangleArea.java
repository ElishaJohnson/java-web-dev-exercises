package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter rectangle width:"));
        double width = input.nextDouble();
        System.out.println(("Enter rectangle height:"));
        double height = input.nextDouble();
        double area = height * width;
        String message = "The rectangle has an area of ";
        System.out.println(message.concat(Double.toString(area)));
    }
}
