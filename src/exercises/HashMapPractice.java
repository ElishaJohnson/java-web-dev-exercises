package exercises;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;
        System.out.println("Enter student information or <ENTER> to finish:");
        do {
            System.out.print("Student name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                Integer newID;
                while (true) {
                    try {
                        System.out.print(newStudent + "'s student ID: ");
                        String inputID = input.nextLine();
                        newID = Integer.parseInt(inputID);
                        break;
                    } catch (Exception ignored){
                        System.out.println("Please enter a valid ID number.");
                    }
                }
                students.put(newID, newStudent);
            }
        } while (!newStudent.equals(""));
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID: " + student.getKey() + "  Name: " + student.getValue());
        }
    }
}
