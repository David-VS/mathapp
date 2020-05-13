package be.ehb.mathapp;

import be.ehb.mathapp.utils.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    public void shouldBeCorrectPower(){
        assertEquals(4, Calculator.power(2,2));
    }

    @Test
    void shouldNotDivideByZero() {
       assertThrows(ArithmeticException.class, new Executable() {
           @Override
           public void execute() throws Throwable {
               Calculator.divide(1,0);
           }
       });
    }

    @Test
    void shouldBeCorrectFactorial(){
        assertEquals(120, Calculator.factorial(5));
    }

    @ParameterizedTest
    @CsvSource({
            "4, 24",
            "5, 120",
            "6, 720"
    })
    void shouldBeCorrectFactorialCSV(int input, int outpout){
        assertEquals(outpout, Calculator.factorial(input));
    }
}
