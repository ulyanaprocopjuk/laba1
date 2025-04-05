package demo.parallel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    private static final double EPS = 1e-9;

    @Test
    public void testDivision() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(1, -1);
        Complex expectedResult = new Complex(1, 3);
        Complex result = a.div(b);
        assertEquals(expectedResult, result, "Результат не совпадает");
    }
}
