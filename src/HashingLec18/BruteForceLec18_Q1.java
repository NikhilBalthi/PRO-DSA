package HashingLec18;

//Longest Subarray with Sum K
public class BruteForceLec18_Q1 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Max Length " + longestSubarrayBruteForce(nums, k));
        // Output: 4 -> Subarray is [5, 2, 7, 1]
    }

    public static int longestSubarrayBruteForce(int[] arr, int k) {
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}