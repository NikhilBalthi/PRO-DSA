package HashingLec14;

// Longest SubArray With ZeroSum
public class BruteForceLec14_Q2 {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println("Max Length of Zero-Sum Subarray is: " + maxLength(nums));
        // Output will be 5 because the subarray [-2, 2, -8, 1, 7] sums to 0
    }

    private static int maxLength(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxLength = 0;

        // Loop 'i' sets the absolute START of your subarray window
        for (int i = 0; i < arr.length; i++) {
            int currentWindowSum = 0;

            // Loop 'j' expands the END of your subarray window forward
            for (int j = i; j < arr.length; j++) {
                currentWindowSum += arr[j]; // Add the current element to the window sum

                // If the window hits a sum of 0, calculate the length using your (j - i + 1) idea
                if (currentWindowSum == 0) {
                    int currLength = j - i + 1;
                    maxLength = Math.max(maxLength, currLength);
                }
            }
        }

        return maxLength;
    }
}
