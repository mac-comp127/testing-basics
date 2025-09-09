package testingbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypoFixer {
    public static final String STUDNETS = "studnets",
        STUDENTS = "students",
        TEH = "teh",
        THE = "the",
        MACALESETER = "Macaleseter",
        MACALESTER = "Macalester";

    /**
     * Fixes the typos defined as constants in this class in the provided string of words.
     * 
     * @param words A string.
     * @return A string with the above typos changed into their correct values.
     */
    public static String fixTypos(String words) {
        List<String> output = new ArrayList<>();
        for (String word : words.split(" ")) {
            if (word.equals(STUDNETS)) {
                output.add(STUDENTS);
            } else if (word.contains(MACALESETER)) {
                output.add(MACALESTER);
            } else if (word.substring(0, 3).equals(TEH)) {
                output.add(THE);
            } else {
                output.add(word);
            }
        }
        return String.join(" ", output);
    }
}

