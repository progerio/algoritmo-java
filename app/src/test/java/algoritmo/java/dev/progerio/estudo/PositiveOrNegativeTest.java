package algoritmo.java.dev.progerio.estudo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PositiveOrNegativeTest {

    @Test
    public void byOperator() {
        assertEquals(ResultEnum.POSITIVE, PositiveOrNegative.byOperator(42));
        assertEquals(ResultEnum.ZERO, PositiveOrNegative.byOperator(0));
        assertEquals(ResultEnum.NEGATIVE, PositiveOrNegative.byOperator(-700));
    }

    @Test
    public void bySignum() {
        assertEquals(ResultEnum.POSITIVE, PositiveOrNegative.bySignum(42));
        assertEquals(ResultEnum.ZERO, PositiveOrNegative.bySignum(0));
        assertEquals(ResultEnum.NEGATIVE, PositiveOrNegative.bySignum(-700));
    }

    @Test
    public void bySignumFloat() {
        assertEquals(ResultEnum.POSITIVE, PositiveOrNegative.bySignum(4.2f));
        assertEquals(ResultEnum.ZERO, PositiveOrNegative.bySignum(0f));
        assertEquals(ResultEnum.NEGATIVE, PositiveOrNegative.bySignum(-7.7f));
    }
}
