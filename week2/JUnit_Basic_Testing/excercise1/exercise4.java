import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class exercise4 {

    private Calculator calculator;

    // Setup method
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange
        System.out.println("Setup complete.");
    }

    // Teardown method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    // Example test using AAA
    @Test
    public void testAddition() {
        // Arrange done in setup

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}

// Supporting Calculator class
class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
}
