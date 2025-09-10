package testingbasics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TypoFixerTest {
    @Test
    void fixMacalester() {
        String output = TypoFixer.fixTypos("Macaleseter");
        assertEquals("Macalester", output);
    }

    @Test
    void fixTeh() {
        String output = TypoFixer.fixTypos("teh quick red fox");
        assertEquals("the quick red fox", output);

        output = TypoFixer.fixTypos("here, tehre, and everywhere");
        assertEquals("here, there, and everywhere", output);
    }

    @Test
    void fixStudnets() {
        String output = TypoFixer.fixTypos("Hello, studnets");
        assertEquals("Hello, students", output);
    }

}
