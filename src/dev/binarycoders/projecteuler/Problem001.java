package dev.binarycoders.projecteuler;

/**
 * Multiples of 3 and 5
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {

    public static void main(String[] args) {
        final var p001 = new Problem001();

        System.out.printf("Answer: %d%n", p001.sumOfMultiples(1000));
    }

    public long sumOfMultiples(final int number) {
        long result = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        return result;
    }
}
