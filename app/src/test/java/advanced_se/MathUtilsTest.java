package advanced_se;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        // Initialize your class before each test
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        // Clean up resources, if any, after each test
    }

    @Test
    void testAdd() {
        // Test for a normal scenario
        assertEquals(10, mathUtils.add(5, 5), "5 + 5 should equal 10");

        // Test for a scenario with negatives
        assertEquals(0, mathUtils.add(5, -5), "5 + (-5) should equal 0");
    }

    @Test
    void testSubtract() {
        // Test for a normal scenario
        assertEquals(0, mathUtils.subtract(5, 5), "5 - 5 should equal 0");

        // Test with negatives
        assertEquals(10, mathUtils.subtract(5, -5), "5 - (-5) should equal 10");
    }

    @Test
    void testMultiply() {
        // Test for a normal scenario
        assertEquals(25, mathUtils.multiply(5, 5), "5 * 5 should equal 25");

        // Test for multiplication by zero
        assertEquals(0, mathUtils.multiply(5, 0), "5 * 0 should equal 0");
    }

    @Test
    void testDivide() {
        // Test for a normal scenario
        assertEquals(1.0, mathUtils.divide(5, 5), "5 / 5 should equal 1.0");

        // Test for division by zero
        assertEquals(-1.0, mathUtils.divide(5, 0), "5 / 0 should return -1.0");

        // Test for a division that results in a non-integer
        assertEquals(2.5, mathUtils.divide(5, 2), "5 / 2 should equal 2.5");
    }
}
