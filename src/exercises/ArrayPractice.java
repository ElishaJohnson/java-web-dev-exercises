package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = phrase.split(" ");
        System.out.println(Arrays.toString(stringArray));
        stringArray = phrase.split("\\.");
        System.out.println(Arrays.toString(stringArray));
    }
}
