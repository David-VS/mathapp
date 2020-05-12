package be.ehb.mathapp;

import be.ehb.mathapp.utils.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

    @Test
    public void shouldAdd(){
        assertEquals(25, Calculator.sum(15,10));
    }

    @Test
    public void shouldAddNegative(){
        assertEquals(5, Calculator.sum(7, -2));
    }

    @ParameterizedTest
    @ValueSource(ints = {42, -8, 0, 8547853})
    public void shouldBeAbsolute(int param){
        assertTrue(Calculator.absolute(param) >= 0);
    }
}
