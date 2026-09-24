import java.util.Arrays;

class Solution {
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        // Find the Greatest Common Divisor (GCD) of all numbers in numsDivide
        int g = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            g = gcd(g, numsDivide[i]);
        }

        // Sort nums to evaluate the smallest elements first
        Arrays.sort(nums);

        // Find the smallest element in nums that divides the GCD
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i; // i is the number of deletions needed
            }
        }

        return -1;
    }
}