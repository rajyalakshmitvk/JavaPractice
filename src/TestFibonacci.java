import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestFibonacci {

    @Test
    public void testFibonacci() {
        assertEquals( 5, new Exercise1().Fibonacci(5 ) );
        assertEquals( 2, new Exercise1().Fibonacci(3 ) );
    }
}
