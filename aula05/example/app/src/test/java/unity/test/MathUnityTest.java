package unity.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MathUnityTest {
    
    // given
    // when 
    // then
    @Test
    public void givenValidIntegers_WhenSum_ThenReturnValidResult(){
        final var a = 2;
        final var b = 3;

        final var result = Math.sum(a, b);

        assertEquals(result, 5);
    }

    @Test
    public void givenValidFloats_WhenDivide_ThenReturnValidResult(){
        final var a = 4.0f;
        final var b = 2.0f;

        final var result = Math.divide(a, b);

        assertEquals(result, 2.0f);
    }

    @Test
    public void givenZeroDivisor_WhenDivide_ThenThrowIllegalArgumentException(){
        final var a = 4.0f;
        final var b = 0.0f;

        final var exception = assertThrows(IllegalArgumentException.class, () -> Math.divide(a, b));

        assertEquals(exception.getMessage(), "Divisor cannot be zero");
    }

}
