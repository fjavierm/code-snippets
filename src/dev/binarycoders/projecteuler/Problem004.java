package dev.binarycoders.projecteuler;

/**
 * Largest palindrome product
 * <p>
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

    public static void main(String[] args) {
        final var p004 = new Problem004();

        System.out.printf("Answer: %d", p004.largestPalindromeProduct());
    }

    public long largestPalindromeProduct() {
        int supLimit = 999;
        int infLimit = 100;
        int result = -1;

        for (int i = supLimit - 1; i >= infLimit; i--) {
            if (i * supLimit < result) {
                break;
            }
            
            for (int j = supLimit - 1; j >= infLimit; j--) {
                final var partialResult = i * j;

                if (isPalindrome(partialResult) && partialResult > result) {
                    result = partialResult;
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(final int number) {
        int reverted = 0;
        int inReversion = number;

        while (inReversion > 0) {
            reverted = reverted * 10 + inReversion % 10;
            inReversion = inReversion / 10;
        }

        return reverted == number;
    }
}
