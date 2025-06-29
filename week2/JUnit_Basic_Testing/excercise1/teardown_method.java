import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class teardown_method {

    @Before
    public void setUp() {
        // Setup code here (e.g., initializing objects)
        System.out.println("Setup before test");
    }

    @Test
    public void testExample() {
        // Test code here
        System.out.println("Executing test");
    }

    @After
    public void tearDown() {
        // Cleanup code here (e.g., closing DB connections, resetting variables)
        System.out.println("Teardown after test");
    }
}
