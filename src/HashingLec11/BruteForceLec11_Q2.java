package HashingLec11;

import java.util.Arrays;

public class BruteForceLec11_Q2 {

    // Method to find indices using Brute Force (Nested Loops)
    public static int[] twoSum(int[] nums, int target) {
        // Outer loop selects the first number
        for (int i = 0; i < nums.length; i++) {
            // Inner loop selects the second number (starts from i + 1 to avoid picking the same element)
            for (int j = i+1; j < nums.length; j++) {
                // Check if the sum of the two numbers matches the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // Return an empty array if no pair is found
        return new int[]{0,0};
    }
    public static void main(String[] args) {
        // --- Test Case 1 ---
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Test Case 1 Indices: " + Arrays.toString(result1));
        // Expected Output: [0, 1] (because 2 + 7 = 9)

        // --- Test Case 2 ---
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Test Case 2 Indices: " + Arrays.toString(result2));
        // Expected Output: [1, 2] (because 2 + 4 = 6)

        // --- Test Case 3 ---
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Test Case 3 Indices: " + Arrays.toString(result3));
        // Expected Output: [0, 1] (because 3 + 3 = 6)
    }
}
