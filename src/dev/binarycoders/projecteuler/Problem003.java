package dev.binarycoders.projecteuler;

/**
 * Largest prime factor
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

    public static void main(String[] args) {
        final var p003 = new Problem003();

        System.out.printf("Answer: %d", p003.largestPrime(600851475143L));
    }

    public long largestPrime(final long number) {
        long n = number;

        while (n % 2 == 0) {
            n /= 2;
        }

        for (long i = 3; i < n; i += 2) {
            while (n % i == 0 && i < n) {
                n /= i;
            }
        }

        return n;
    }
}
