package algoritmo.java.dev.progerio.estudo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ToggleBooleanTest {

    @Test
    public void shouldReturnFalse() {
        Boolean b = true;
        b = ToggleBoolean.toggle(b);
        assertFalse(b);
    }

    @Test
    public void shouldReturnTrue() {
        Boolean b = false;
        b = ToggleBoolean.toggle(b);
        assertTrue(b);
    }

    @Test
    public void shouldReturnNull() {
        Boolean b = null;
        b = ToggleBoolean.toggle(b);
        assertNull(b);
    }

}
