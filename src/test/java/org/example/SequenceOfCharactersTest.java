package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class SequenceOfCharactersTest {
    @Test
    void shouldReturnTwelveAsLengthOfTheStringWhenThoughtWorksIsPassedAsString() {
        String actual = "ThoughtWorks";

        SequenceOfCharacters string = new SequenceOfCharacters(actual);

        assertEquals(12, string.length());
    }

    @Test
    void shouldReturnTwelveAsLengthOfTheStringWhenThoughtWhiteSpaceWorksIsPassedAsString() {
        String actual = "Thought Works";

        SequenceOfCharacters string = new SequenceOfCharacters(actual);

        assertEquals(12, string.length());
    }

    @Test
    void shouldReturnTwelveAsLengthOfTheStringWhenThoughtWorksWithNumbersIsPassedAsString() {
        String actual = "ThoughtWorks123";

        SequenceOfCharacters string = new SequenceOfCharacters(actual);

        assertEquals(12, string.length());
    }

    @Test
    void shouldReturnTwelveAsLengthOfTheStringWhenThoughtWorksWithSpecialCharactersIsPassedAsString() {
        String actual = "ThoughtWorks@#";

        SequenceOfCharacters string = new SequenceOfCharacters(actual);

        assertEquals(12, string.length());
    }
}