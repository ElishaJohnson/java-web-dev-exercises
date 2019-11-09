package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void sumOfEvenNumbers (ArrayList<Integer> inArray) {
        for (int num : inArray) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void printFive (ArrayList<String> inArray) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter word length: ");
        int wordLength = input.nextInt();
        for (String word : inArray) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
    public static void main (String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 100; i += 3) {
            numList.add(i);
        }
        sumOfEvenNumbers(numList);
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = phrase.split("[ ,.]+");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phraseArray));
        printFive(wordList);
    }
}
