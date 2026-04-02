package be.ehb.mathapp;

import be.ehb.mathapp.controller.CalcController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class MockTest {

    @Mock
    CalcController calcController;

    @BeforeEach
    public void initEachTest(){
        //calcController setup if needed
        calcController = new CalcController();
    }

    @Test
    void canIDoSomethingOnMyMockedController(){
        assertEquals(3, calcController.sum(2,1));
    }
}
