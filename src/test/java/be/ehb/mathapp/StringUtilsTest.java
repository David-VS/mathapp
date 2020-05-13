package be.ehb.mathapp;

import be.ehb.mathapp.utils.Calculator;
import be.ehb.mathapp.utils.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"mooi dit idioom", "racecar", "kajak", "Tim Smit"})
    void shouldBePalindrome(String input){
        assertTrue(StringUtils.isPalindroom(input));
    }
}
