import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFactorial {

    @Test
    public void testFactorial() {
        assertEquals(120, new Factorial().fact(5));
        assertEquals(1, new Factorial().fact(0));
    }
}
