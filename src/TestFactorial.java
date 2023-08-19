import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFactorial {

    @Test (timeout = 50)
    public void testFactorial() {
        assertEquals(479001600, new Factorial().fact(12));
        assertEquals(1, new Factorial().fact(0));
    }
}
