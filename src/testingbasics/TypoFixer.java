package testingbasics;

import java.util.ArrayList;
import java.util.List;

public class TypoFixer {
    /**
     * Fixes the typos defined as constants in this class in the provided string of words.
     * 
     * @param words A string.
     * @return A string with the above typos changed into their correct values.
     */
    public static String fixTypos(String words) {
        List<String> output = new ArrayList<>();
        for (String word : words.split(" ")) {
            if (word.equals("studnets")) {
                output.add("students");
            } else if (word.contains("Macaleseter")) {
                output.add("Macalester");
            } else if (word.substring(0, 3).equals("teh")) {
                output.add("the");
            } else {
                output.add(word);
            }
        }
        return String.join(" ", output);
    }
}

