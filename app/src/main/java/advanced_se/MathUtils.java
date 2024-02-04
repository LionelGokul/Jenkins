package advanced_se;

public class MathUtils {

    /**
     * Adds two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     * @param a The integer to subtract from.
     * @param b The integer to be subtracted.
     * @return The result of subtracting b from a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of dividing a by b. Returns -1.0 if b is 0.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            // Handle division by zero
            return -1.0;
        }
        return (double) a / b;
    }
}
