package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a word or phrase to search for:");
        String searchQuery = input.nextLine();
        boolean match = firstLine.toLowerCase().contains(searchQuery.toLowerCase());
//        System.out.println(match);
        if (match) {
            int matchIndex = firstLine.toLowerCase().indexOf(searchQuery.toLowerCase());
            System.out.println("Search phrase length: " + searchQuery.length());
            System.out.println("Search phrase index: " + matchIndex);
            firstLine = firstLine.substring(0, matchIndex) + firstLine.substring(matchIndex + searchQuery.length(), firstLine.length() - 1);
            System.out.println("First sentence with '" + searchQuery + "' removed:");
            System.out.println(firstLine);
        } else {
            System.out.println("Search phrase not found.");
        }
    }
}
